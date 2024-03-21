#include <iostream>
#include "Node.cpp"
using namespace std;


class DoubleLinkedList {
private:
    Node* head;
    Node* tail;

public:
    DoubleLinkedList() {
        head = NULL;
        tail = NULL;
    }

    void addNodeBack(int value) {
        Node* newNode = new Node(value,NULL,NULL);
        newNode->data = value;
        newNode->prev = NULL;
        newNode->next = NULL;

        if (head == NULL) {
            head = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            newNode->prev = tail;
            tail = newNode;
        }
    }

    void addNodeFront(int value) {
        Node* newNode = new Node(value,NULL,NULL);
        newNode->data = value;
        newNode->prev = NULL;
        newNode->next = NULL;

        if (head == NULL) {
            head = newNode;
            tail = newNode;
        } else {
            newNode->next = head;
            head->prev = newNode;
            head = newNode;
        }
    }

    void removeNodeFront() {
        if (head == NULL) {
            cout << "List is empty" << endl;
        } else {
            Node* temp = head;
            head = head->next;
            if (head != NULL) {
                head->prev = NULL;
            } else {
                tail = NULL;
            }
            delete temp;
        }
    }

    void removeNodeBack() {
        if (tail == NULL) {
            cout << "List is empty" << endl;
        } else {
            Node* temp = tail;
            tail = tail->prev;
            if (tail != NULL) {
                tail->next = NULL;
            } else {
                head = NULL;
            }
            delete temp;
        }
    }

    void deleteNode(Node* node) {
        if (node == NULL) {
            return;
        }

        if (node == head) {
            removeNodeFront();
        } else if (node == tail) {
            removeNodeBack();
        } else {
            node->prev->next = node->next;
            node->next->prev = node->prev;
            delete node;
        }
    }

    void remove(int value) {
        Node* current = head;
        while (current != NULL) {
            if (current->data == value) {
                deleteNode(current);
                return;
            }
            current = current->next;
        }
        cout << "Value not found in the list" << endl;
    }

    void display() {
        Node* current = head;
        while (current != NULL) {
            cout << current->data << " ";
            current = current->next;
        }
        cout << endl;
    }

    void iterateForward() {
        Node* current = head;
        while (current != NULL) {
            cout << current->data << " ";
            current = current->next;
        }
        cout << endl;
    }

    void iterateBackward() {
        Node* current = tail;
        while (current != NULL) {
            cout << current->data << " ";
            current = current->prev;
        }
        cout << endl;
    }

    void clear() {
        Node* current = head;
        while (current != NULL) {
            Node* temp = current;
            current = current->next;
            delete temp;
        }
        head = NULL;
        tail = NULL;
    }
};

