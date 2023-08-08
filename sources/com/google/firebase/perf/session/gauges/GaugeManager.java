package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import com.google.firebase.components.C32611y;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.GaugeMetadata;
import com.google.firebase.perf.p049v1.GaugeMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C33363a logger = C33363a.m134449e();
    private ApplicationProcessState applicationProcessState;
    private final C33307a configResolver;
    private final C32611y<C33403c> cpuGaugeCollector;
    @C0363p0
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C32611y<ScheduledExecutorService> gaugeManagerExecutor;
    @C0363p0
    private C33409i gaugeMetadataManager;
    private final C32611y<C33412l> memoryGaugeCollector;
    @C0363p0
    private String sessionId;
    private final C33424k transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    public static /* synthetic */ class C33400a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81173a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.perf.v1.ApplicationProcessState[] r0 = com.google.firebase.perf.p049v1.ApplicationProcessState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f81173a = r0
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p049v1.ApplicationProcessState.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81173a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p049v1.ApplicationProcessState.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.C33400a.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C32611y(new C33406f()), C33424k.m134761l(), C33307a.m134328h(), (C33409i) null, new C32611y(new C33407g()), new C32611y(new C33408h()));
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        int i = C33400a.f81173a[applicationProcessState2.ordinal()];
        if (i == 1) {
            j = this.configResolver.mo96340A();
        } else if (i != 2) {
            j = -1;
        } else {
            j = this.configResolver.mo96341B();
        }
        if (C33403c.m134697f(j)) {
            return -1;
        }
        return j;
    }

    private GaugeMetadata getGaugeMetadata() {
        return (GaugeMetadata) GaugeMetadata.newBuilder().mo97009a0(this.gaugeMetadataManager.mo96816a()).mo97010b0(this.gaugeMetadataManager.mo96817b()).mo97011c0(this.gaugeMetadataManager.mo96818c()).mo100473g();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        int i = C33400a.f81173a[applicationProcessState2.ordinal()];
        if (i == 1) {
            j = this.configResolver.mo96343D();
        } else if (i != 2) {
            j = -1;
        } else {
            j = this.configResolver.mo96344E();
        }
        if (C33412l.m134714e(j)) {
            return -1;
        }
        return j;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C33403c lambda$new$0() {
        return new C33403c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C33412l lambda$new$1() {
        return new C33412l();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.mo96429a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().mo96811k(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.mo96429a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().mo96826j(j, timer);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState2) {
        GaugeMetric.C33458b newBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().f81187a.isEmpty()) {
            newBuilder.mo97038b0(this.cpuGaugeCollector.get().f81187a.poll());
        }
        while (!this.memoryGaugeCollector.get().f81212b.isEmpty()) {
            newBuilder.mo97034V(this.memoryGaugeCollector.get().f81212b.poll());
        }
        newBuilder.mo97052u0(str);
        this.transportManager.mo96859E((GaugeMetric) newBuilder.mo100473g(), applicationProcessState2);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C33409i(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState2) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.mo96859E((GaugeMetric) GaugeMetric.newBuilder().mo97052u0(str).mo97051s0(getGaugeMetadata()).mo100473g(), applicationProcessState2);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState2) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(applicationProcessState2, perfSession.mo96777d());
        if (startCollectingGauges == -1) {
            logger.mo96439l("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String i = perfSession.mo96782i();
        this.sessionId = i;
        this.applicationProcessState = applicationProcessState2;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new C33405e(this, i, applicationProcessState2), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C33363a aVar = logger;
            aVar.mo96439l("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            ApplicationProcessState applicationProcessState2 = this.applicationProcessState;
            this.cpuGaugeCollector.get().mo96812l();
            this.memoryGaugeCollector.get().mo96827k();
            ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.gaugeManagerExecutor.get().schedule(new C33404d(this, str, applicationProcessState2), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    private static void collectGaugeMetricOnce(C33403c cVar, C33412l lVar, Timer timer) {
        cVar.mo96806c(timer);
        lVar.mo96822c(timer);
    }

    @C0344h1
    public GaugeManager(C32611y<ScheduledExecutorService> yVar, C33424k kVar, C33307a aVar, C33409i iVar, C32611y<C33403c> yVar2, C32611y<C33412l> yVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = yVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = yVar2;
        this.memoryGaugeCollector = yVar3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState2, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == -1) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
