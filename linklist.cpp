



Void insert_end()
{
//take the pointer to hold the address of nodetype record
Nodetype *p;
//allocate runtime memory for new record of nodetype using new operator
p = new Nodetype ;
cout<<=Enter the data in node: <;
cin>>p->data;
/* l i s t i s empty */
i f ( first == NULL )
/* p becomes first node and first and last pointer will point to same node */
 first=last = p;
else {
/* link the last pointer with newly created node (p) */
 last->next = p;
 last = p; /* assign p to last node */
 }
}


Void insert_start()
{
//take the pointer to hold the address of nodetype record
Nodetype *p;
//allocate runtime memory for new record of nodetype using new operator
p = new Nodetype ;
cout<<=Enter the data in node: <;
cin>>p->data;
i f ( first == NULL ) /* l i s t i s empty */
/* p becomes first node and first and last pointer will point to same node */
 first=last = p;
else {
 p->next=first; /* link the new node with first node */
 fisrt = p; /* assign p to last node */
 }
}



Nodetype search (int key){
Nodetype *p = NULL;
p = first ;
while ( p != NULL && p->data != key)
{
p = p->next ;
}
return p; /* if p is NULL then value not found */
}


void insert_after (int key){
Nodetype *p = NULL;
p=search(key);
if(p==NULL)
cout<<=value not found=;
else
{
 Notetype *Newnode;
 Newnode= new Notetype;
if(p==last)
 {
 last->next=p;
 last=p;
 }
else
{
 Newnode->next=p->next;
 p->next=Newnode;
}
Cout<<=New node linked successfully=;
}


Void delete_first()
{
Nodetype *p;
if ( first == NULL ) /* l i s t i s empty */
 cout<<"\n Linked List is empty";
else
{ /* non-empty l i s t */
 p = first ;
 first = first ->next ;
 delete ( p ) ; /* free up memory */
}
}


Void delete_last()
{
NodeT *q, *q1;
q1 = NULL; /* i n i t i a l i z e */
q = first ;
if(q==NULL)
{
 Cout<<"\n Linked List is empty";
}
else
{ /* non-empty l i s t */
while ( q != last )
{ /* advance towards end */
q1 = q; /*q1 will follow the q pointer */
q = q->next ;
}
i f ( q == first )
{ /* only one node */
first = last = NULL;
}
else
{ /* more than one node */
q1->next = NULL;
last = q1;
}
delete q; }
 }
 
 void remove_spec(int key)
{
Nodetype *q, *q1;
q1 = NULL; /* i n i t i a l i z e */
q = f i r s t ;
/* search node */
while ( q != NULL && q->data != key )
{
q1 = q;
q = q->next ;
}
i f ( q == NULL )
{ cout<<" Not found supplied key";
}
else if(q==first && q==last)
{
 delete q;
 first=last=NULL;
}
else if (q==last)
{
	q1->next=NULL;
 last=q1; /* make 2nd last node as last node */
 delete q;
}
else /* other than f i r s t node and last */
{
q1->next = q->next ;
delete q; } 

}


void deleteCompleteList()
{
while ( first != NULL )
{
p = first ;
first = first ->next ;
free ( p ) ;
}
last = NULL;	
}



