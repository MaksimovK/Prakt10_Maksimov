abstract class AbstractOnInterface: InterfaceCable {
    override var cable = "Витая пара"
    override var type = "UTP"
    override var countCore = 4
    override var D = 2.4
    override var Q = D / countCore.toDouble()

    override fun GetInfo() {
        println(cable)
        println(type)
        println(countCore)
        println(D)
        println(Q)
    }
}