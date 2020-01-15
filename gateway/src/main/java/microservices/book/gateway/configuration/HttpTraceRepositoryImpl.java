package microservices.book.gateway.configuration;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class HttpTraceRepositoryImpl implements HttpTraceRepository {

    private List<HttpTrace> traces = new ArrayList<>();

    @Override
    public List<HttpTrace> findAll() {
        return traces;
    }

    @Override
    public void add(HttpTrace trace) {
        traces.add(trace);

    }

}

