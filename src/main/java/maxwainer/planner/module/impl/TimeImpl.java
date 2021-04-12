package maxwainer.planner.module.impl;

import java.util.Date;
import maxwainer.planner.api.task.Time;
import org.jetbrains.annotations.NotNull;

public class TimeImpl implements Time {
  private final Date startDate;
  private final Date endDate;

  public TimeImpl(Date startDate, Date endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Override
  public Date getStart() {
    return startDate;
  }

  @Override
  public Date getEnd() {
    return endDate;
  }

  @Override
  public boolean compare(@NotNull Time time) {
    return startDate == time.getStart() && endDate == time.getEnd();
  }

  @Override
  public Time cloneObject() throws CloneNotSupportedException {
    return (Time) clone();
  }
}
