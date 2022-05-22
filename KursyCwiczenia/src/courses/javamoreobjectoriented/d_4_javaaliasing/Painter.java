package courses.javamoreobjectoriented.d_4_javaaliasing;

import java.time.Duration;

public interface Painter {
    int getId();
    boolean isAvailable();
    Duration estimateTimeToPaint(double sqMeters);
    Money estimateCompensation(double sqMeters);
    String getName();
    double estimateSqMeters(Duration time);
}























