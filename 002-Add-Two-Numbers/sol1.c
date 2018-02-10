/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *res = NULL; //用于返回
    struct ListNode *cur = NULL; //用于表示当前节点
    struct ListNode *pre = NULL; //用于记录前一节点
    int forward = 0;             //进位
    int first = 1;               //是否为第一个节点
    int v1 = 0;                  //节点的值
    int v2 = 0;                  //节点的值
    
    while(1)
    {
        if ( l1 == NULL && l2 == NULL && forward == 0 )
            break;
        
        v1 = ( l1 != NULL ) ? l1->val : 0;
        v2 = ( l2 != NULL ) ? l2->val : 0;  
        
        cur = (struct ListNode*)malloc(sizeof(struct ListNode));
        cur->val = (v1 + v2 + forward) % 10;
        cur->next = NULL;
        forward = (v1 + v2 + forward) / 10;
        if( first ){
            res = cur;
            first = 0;
        }else{
            pre->next = cur;
        }
        pre = cur;
        l1 = ( l1 == NULL) ? NULL : l1->next;
        l2 = ( l2 == NULL) ? NULL : l2->next;
    }
    
    return res;
}
