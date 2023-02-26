abstract class AbstractCable {
    abstract var cable: String
    abstract var type: String
    abstract var countCore: Int
    abstract var D: Double
    abstract var Q: Double
    abstract fun GetInfo()

    constructor(_cable: String, _type: String, _countCore: Int, _D: Double){
        cable = _cable
        type = _type
        countCore = _countCore
        D = _D
    }

    constructor(_cable: String, _type: String){
        cable = _cable
        type = _type
    }
}