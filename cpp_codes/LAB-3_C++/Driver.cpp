#include <iostream>
#include "DoubleLinkedList.cpp"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	DoubleLinkedList dl;

    dl.addNodeBack(2);
    dl.addNodeBack(4);
    dl.addNodeBack(6);
    dl.addNodeBack(8);
    dl.addNodeBack(10);

    cout << "Original List: ";
    dl.display();

    int val;
    cout << "Enter value at the Front of the List: ";
    cin >> val;
    dl.addNodeFront(val);

    cout << "Updated List: ";
    dl.display();

    cout << "Enter value at the Back of the List: ";
    cin >> val;
    dl.addNodeBack(val);

    cout << "Updated List: ";
    dl.display();

    cout << "Remove value from the Front of the List" << endl;
    dl.removeNodeFront();

    cout << "Updated List: ";
    dl.display();

    cout << "Remove value from the Back of the List" << endl;
    dl.removeNodeBack();

    cout << "Updated List: ";
    dl.display();

    cout << "Iterate iterateBackward" << endl;
    dl.iterateBackward();
    cout << "Iterate iterateForward" << endl;
    dl.iterateForward();

    cout << "Delete specific value from the above list: ";
    cin >> val;
    dl.remove(val);

    cout << "Updated List: ";
    dl.display();

    cout << "Delete all nodes one by one (Y)es or (N)o: ";
    string input;
    cin >> input;

    if (input == "Y" || input == "y") {
        dl.clear();
        cout << "Updated List: ";
        dl.display();
    }

    return 0;
}
