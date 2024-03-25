#include <iostream>
#include "CircularLinkedList.cpp"

using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	  CircularLinkedList cll;
    cll.addNode(1);
    cll.addNode(2);
    cll.addNode(3);
    cll.addNode(4);
    cll.addNode(6);
    cll.addNode(7);
    cll.addNode(9);
    
     cll.display();
    cout << "\n";
    cout << "Enter Key to Search" << "\n";
    int givenKey;
    cin >> givenKey;
    
     cout << " Searched Key Founded = " << cll.searchKey(givenKey) << "\n";

    cout << "Enter Key to insert before" << "\n";
    cin >> givenKey;
    cout << "Enter new Key to insert" << "\n";
    int newValue;
    cin >> newValue;
    cll.insertBefore(givenKey, newValue);

    cll.display();
    cout << endl;

    cout << "Enter Key to insert after" << "\n"; //suppose 7
    cin >> givenKey;
    cout << "Enter new Key to insert" << "\n"; //suppose 8
    cin >> newValue;
    cll.insertAfter(givenKey, newValue);

    cll.display();
    cout << endl;

    cout << "Enter Key to delete a node" << "\n"; //suppose 7
    cin >> givenKey;
    cll.deleteNode(givenKey);

    cll.display();
    cout << endl;

    cout << "Do you want to delete all nodes? (Y)es or (N)o" << "\n";
    string userInput;
    cin >> userInput;

    if (userInput == "Y" || userInput == "y") {
        cll.deleteNodeAll();
    }

    cll.display();
    cout << "\n";
	return 0;
}
