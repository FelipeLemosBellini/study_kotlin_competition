class ListNode(var number: Int) {
    var next: ListNode? = null
}

// Função para adicionar um nó ao final da lista
fun addNode(head: ListNode?, value: Int): ListNode {
    val newNode = ListNode(value)
    if (head == null) {
        return newNode
    }
    var current = head
    while (current?.next != null) {
        current = current.next
    }
    current?.next = newNode
    return head
}

// Função para percorrer e imprimir a lista
fun printList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.number} -> ")
        current = current.next
    }
    println("null")
}

/// add ordenado
fun addNodeOrder(head: ListNode?, value: Int): ListNode {
    val newNode = ListNode(value)

    // Se a lista estiver vazia ou o novo valor for menor que o valor do head, insira no início
    if (head == null || value < head.number) {
        newNode.next = head
        return newNode
    }

    // Percorre a lista para encontrar a posição correta de inserção
    var current = head
    while (current?.next != null && current.next!!.number < value) {
        current = current.next
    }

    // Insere o novo nó na posição correta
    newNode.next = current?.next
    current?.next = newNode

    return head
}

// Função para modificar um valor específico na lista
fun modifyNodeValue(head: ListNode?, target: Int, newValue: Int) {
    var current = head
    while (current != null) {
        if (current.number == target) {
            current.number = newValue
            return
        }
        current = current.next
    }
}

fun main() {
    // Criando a lista encadeada
    val head = ListNode(1)
    addNodeOrder(head, 4)
    addNodeOrder(head, 3)
    addNodeOrder(head, 2)

    println("Lista original:")
    printList(head)

    // Modificando o valor do nó com número 3 para 99
//    modifyNodeValue(head, 3, 99)

//    println("Lista após a modificação:")
//    printList(head)
}