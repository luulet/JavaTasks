# Main loop algorithm

1. Remove next event from future event list
2. Advance simulation clock to time of event
3. Update time-accumulating measures based on time elapsed since last event and store last event time
4. Process event
5. If other events are scheduled at last event time, execute all of them
6. Repeat
7. If termination condition is met, end simulation and calculate post-processed measures
