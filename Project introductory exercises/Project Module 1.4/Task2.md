# Event based counters

Arrival count is updates at each arrival event, and Completed count is updated at each completion event.

Individual response time is completed at each completion event.

# Time-accumulating measures

Busy time is increasing while the service point is busy.

Cumulative response time is calculated at each completion event by adding the individual response time to the cumulative response time.

# Post-Processed measures

Utilization is calculated at the end of the simulation by dividing the total busy time by the total time.

Thoughput is calculated at the end of the simulation by dividing the total completed count by the total time.

Average service time is calculated at the end of the simulation by dividing the total busy time by the total completed count.

Average response time is calculated at the end of the simulation by dividing the cumulative response time by the total completed count.

