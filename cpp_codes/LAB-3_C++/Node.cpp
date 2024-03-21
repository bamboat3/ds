#include <iostream>
using namespace std;


class Node {
public:
    Node(int val, Node* next, Node* prev) {
        this->data = val;
        this->prev = prev;
        this->next = next;
    }
    
    int data;
    Node* next;
    Node* prev;
    
    int get() { return data; }
    Node* getNext() { return next; }
};
