class HeirCable (cable: String, type: String, countCore: Int, D: Double, var P: Boolean) : AbstractCable(cable, type, countCore, D)
{
    override var cable: String = cable
    override var type: String = type
    override var countCore: Int = countCore
    override var D: Double = D
    override var Q = D / countCore.toDouble()

    override fun GetInfo() {
        println(cable)
        println(type)
        println(countCore)
        println(D)
        println(Q)
    }
    fun getQp(): Double {
        return if(P) 2.0 * Q else 0.7 * Q
    }

}