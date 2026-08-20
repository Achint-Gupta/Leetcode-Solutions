/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode *temp=node->next,*prev=NULL;
        while(temp!=NULL){
            node->val=temp->val;
            prev=node;
            node=temp;
            temp=temp->next;
        }
        prev->next=NULL;
    }
};