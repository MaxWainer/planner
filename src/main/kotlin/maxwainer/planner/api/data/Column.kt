package maxwainer.planner.api.data

interface Column<T> {

    val name: String

    val obj: T

    val isNullable: Boolean


}