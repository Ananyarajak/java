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
void deleteAlternateNode(node *head)
{
  node *curr_node = head;
  while (curr_node != NULL && curr_node->next != NULL)
  {
    node *temp = curr_node->next;
    curr_node->next = curr_node->next->next;
    free(temp);
    curr_node = curr_node->next;
  }
}
int main()
{

  LinkedList ll;
  ll.insertAtail(1);
  ll.insertAtail(2);
  ll.insertAtail(3);
  ll.insertAtail(4);
  ll.insertAtail(5);
  // ll.insertAtail(6);
  ll.display();
  deleteAlternateNode(ll.head);
  ll.display();
  return 0;
}
