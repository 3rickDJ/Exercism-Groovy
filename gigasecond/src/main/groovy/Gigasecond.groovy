import java.time.LocalDateTime
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Gigasecond {

    static def add(moment){
        moment.atStartOfDay().plus(10**9, ChronoUnit.SECONDS)
    }
}
