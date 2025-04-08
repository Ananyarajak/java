#include <iostream>
using namespace std;
class node
{
public:
    int val;
    node *next;

    node(int data)
    {
        val = data;
        next = NULL;
    }
};
class LinkedList
{
public:
    node *head;

    LinkedList()
    {
        head = NULL;
    }
    void insertAtail(int x)
    {
        node *new_node = new node(x);
        if (head == NULL)
        {
            head = new_node;
            return;
        }
        node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = new_node;
    }

    void display()
    {
        node *temp = head;
        while (temp != NULL)
        {
            cout << temp->val << "->";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};
int getlength(node *head)
{
    node *temp = head;
    int length = 0;
    while (temp != NULL)
    {
        length++;
        temp = temp->next;
    }
    return length;
}
node *moveheadbyk(node *head, int k)
{
    node *ptr = head;
    while (k--)
    {
        ptr = ptr->next;
    }
    return ptr;
}
node *getIntersection(node *head1, node *head2)
{
    int l1 = getlength(head1);
    int l2 = getlength(head2);
    node *ptr1;
    node *ptr2;
    if (l1 > l2)
    {
        int k = l1 - l2;
        ptr1 = moveheadbyk(head1, k);
        ptr2 = head2;
    }
    else
    {
        int k = l1 - l2;
        ptr1 = head1;
        ptr2 = moveheadbyk(head2, k);
    }
    while (ptr1)
    {
        if (ptr1 == ptr2)
        {
            return ptr1;
        }
        ptr1 = ptr1->next;
        ptr2 = ptr2->next;
    }
    return NULL;
}
int main()
{

    LinkedList ll1;
    ll1.insertAtail(1);
    ll1.insertAtail(2);
    ll1.insertAtail(3);
    ll1.insertAtail(4);
    ll1.insertAtail(5);
    ll1.insertAtail(6);

    ll1.display();
    LinkedList ll2;
    ll2.insertAtail(6);
    ll2.insertAtail(7);
    ll2.head->next->next = ll1.head->next->next->next;
    ll2.display();
    node *intersection = getIntersection(ll1.head, ll2.head);
    if (intersection)
    {
        cout << intersection->val << endl;
    }
    else
    {
        cout << "-1" << endl;
    }

    return 0;
}
