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
    void deleteDuplicateNodes()
    {
        node *curr_node = head;
        while (curr_node!=NULL)
        {
            while (curr_node->val == curr_node->next->val && curr_node->next!=NULL)
            {
                // delete curr_node
                node *temp = curr_node->next; // node to be deleted
                curr_node->next = curr_node->next->next;
                free(temp);
            }
            // this loop ends when current node and next node values are different
            // or linked list ends
            curr_node = curr_node->next;
        }
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
int main()
{

    LinkedList ll;
    ll.insertAtail(1);
    ll.insertAtail(2);
    ll.insertAtail(2);
    ll.insertAtail(3);
    ll.insertAtail(3);
    ll.insertAtail(3);
    ll.insertAtail(4);
    ll.display();
    ll.deleteDuplicateNodes();
    ll.display();
    return 0;
}
