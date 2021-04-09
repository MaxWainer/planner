package maxwainer.planner.api.data

interface DataAdapter {

    fun <T> push(o: T)

    fun <T> get(key: String): T

}