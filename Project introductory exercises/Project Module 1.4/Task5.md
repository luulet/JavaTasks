# A-phase (advance phase)

This phase contains:
- Selecting next event from future event list
- Advancing simulation clock
- Updating time-dependent measures

# B-phase (event processing phase)

This phase contains:
- Processing the event (e.g., updating counters, scheduling new events)
- If other events are scheduled at the same time, processing all of them before moving to the next event in the future event list.

# C-phase (conditional phase)

This phase occurs when certain conditions are met, such as the termination condition of the simulation.