package leetcode

fun main() {
    var list1: ListNode = addInNewList(1, null)
    list1 = addInNewList(3, list1)
    list1 = addInNewList(5, list1)
    list1 = addInNewList(7, list1)

    showList(list1)
//
//    val li6 = ListNode(2)
//    val li7 = ListNode(4)
//    val li8 = ListNode(6)
//    val li9 = ListNode(8)
//
//    li6.next = li7
//    li7.next = li8
//    li8.next = li9
//
//
//
//
//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//        if (list1 == null || list2 == null) {
//            if (list1 == null) {
//                return list2
//            } else {
//                return list1
//            }
//        }
//
//        var node1: ListNode? = list1.next//criar um teste para ver se tem q começar com o list1 ou list 2
//        var node2: ListNode? = list2
//        var new: ListNode? = null
//
////        addInNewList(list1, new)
//
//        println(node1?.number)
//        println(node2?.number)
//        println(new?.number)
//
//        while (node1 != null || node2 != null) {
//            if (node1 != null && node2 != null) {
//                println("teste: " + node1.number.toString() + " e " + node2.number.toString())
//                if (node1.number <= node2.number) {
//                    new?.next = node1
//                    node1 = node1.next
//                } else {
//                    new?.next = node2
//                    node2 = node2.next
//                }
//            } else {
//                println("tá faltando um")
//                if (node1 != null) {
//                    println("Add do node1 " + node1.number)
//                    new?.next = node1
//                    node1 = node1.next
//                } else if (node2 != null) {
//                    println("Add do node2 " + node2.number)
//                    new?.next = node2
//                    node2 = node2.next
//                }
//            }
//
//            println("Numero ADD no No " + new?.next?.number)
//        }
//        return new
//    }
//
//    var newList = mergeTwoLists(list1, null)
//
//    showList(newList)
//
//    println("\nNós")
//
}

fun showList(listNode: ListNode?) {
    var current = listNode
    while (current != null) {
        println("number: " + current.number)
        current = current.next
    }
}

fun addInNewList(value: Int, currentListNode: ListNode?): ListNode {
    var new: ListNode? = currentListNode

    if (new?.next == null) {
        new = ListNode(value)
    } else {
        new = addInNewList(value, new.next)
    }
    println(new.number)
    return new
}

class ListNode(var number: Int) {
    var next: ListNode? = null
}