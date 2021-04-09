package maxwainer.planner.api

import maxwainer.planner.api.data.DataHoldable
import java.util.*

interface Task<T : Task<T>> : DataHoldable<T> {

    val startDate: Date

    val endDate: Date

    val note: String

}