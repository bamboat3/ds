#include <iostream>

class Node {
public:
    int value;
    Node* nextNode;

    Node(int value) {
        this->value = value;
        this->nextNode = nullptr;
    }
};

