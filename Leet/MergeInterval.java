import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return new ArrayList<>();
        }

        // Sort the intervals by their start times.
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            if (currentInterval.end >= nextInterval.start) {
                // Intervals overlap, merge them.
                currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
            } else {
                // Intervals do not overlap, add the current interval to the result and update the current interval.
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last interval to the result.
        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }
}
