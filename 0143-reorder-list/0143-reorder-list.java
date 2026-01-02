/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        int size=getSize(head);
        ListNode[] nums=new ListNode[size];
        ListNode curr=head;
        for(int i=0;i<size;i++)
        {
            nums[i]=curr;
            curr=curr.next;
        }
        int left=0,right=size-1;
        while(left<right)
        {
            nums[left].next=nums[right];
            left++;

            if(left==right) break;
            nums[right].next=nums[left];
            right--;
        }
        nums[right].next=null;
        
    }
    public int getSize(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;

    }
}