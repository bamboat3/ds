#include <iostream>
#include "Node.cpp"

class CircularLinkedList {
private:
    Node* head = nullptr;
    Node* tail = nullptr;

public:
    void addNode(int value) {
        Node* newNode = new Node(value);

        if (head == nullptr) {
            head = newNode;
        } else {
            tail->nextNode = newNode;
        }

        tail = newNode;
        tail->nextNode = head;
    }

    void display() {
        Node* currentNode = head;
        
        if (currentNode != nullptr) {
            do {
                std::cout << currentNode->value << " ";
                currentNode = currentNode->nextNode;
            } while (currentNode != head);
        } else {
            std::cout << "Empty List";
        }
    }

    Node* searchKey(int givenKey) {
        Node* currentNode = head;
        
        if (currentNode != nullptr) {
            do {
                if (currentNode->value == givenKey) {
                    return currentNode;
                }
                currentNode = currentNode->nextNode;
            } while (currentNode != head);
        }
        
        return nullptr;
    }

    void insertBefore(int givenKey, int newValue) {
        Node* newNode;
        Node* currentNode;
        Node* nextNode = nullptr;
        
        currentNode = head;
        newNode = new Node(newValue);
        
        do {
            nextNode = currentNode;
            currentNode = currentNode->nextNode;
            if (currentNode->value == givenKey) {
                break;
            }
        } while (currentNode != head);
        
        if (currentNode->value == givenKey) {
            nextNode->nextNode = newNode;
            newNode->nextNode = currentNode;
        }
    }

    void insertAfter(int givenKey, int newValue) {
        // Code to be completed
    }

    void deleteNode(int givenKey) {
        Node* currentNode;
        Node* nextNode = nullptr;
        
        currentNode = head;
        
        do {
            nextNode = currentNode;
            currentNode = currentNode->nextNode;
            if (currentNode->value == givenKey) {
                break;
            }
        } while (currentNode != head);
        
        if (currentNode->value == givenKey) {
            if (currentNode == currentNode->nextNode) {
                std::cout << "List now empty";
            } else {
                nextNode->nextNode = currentNode->nextNode;
                if (currentNode == head) {
                    head = nextNode;
                }
            }
        }
    }

    void deleteNodeAll() {
        Node* currentNode;
        Node* nextNode = nullptr;
        
        currentNode = head;
        
        do {
            nextNode = currentNode;
            currentNode = currentNode->nextNode;
        } while (currentNode != head);
        
        head = nullptr;
    }
};

