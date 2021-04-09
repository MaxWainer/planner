package maxwainer.planner.api.data

interface DataHoldable<T : DataHoldable<T>> {

    fun build(adapter: DataAdapter)

    fun of(adapter: DataAdapter): T

}