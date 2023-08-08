package com.google.firebase.perf.config;

import com.google.firebase.perf.C33278a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ConfigurationConstants {

    public static final class LogSourceName extends C33308b<String> {

        /* renamed from: a */
        public static LogSourceName f80944a;

        /* renamed from: b */
        public static final Map<Long, String> f80945b = Collections.unmodifiableMap(new HashMap<Long, String>() {
            {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        });

        /* renamed from: f */
        public static synchronized LogSourceName m134214f() {
            LogSourceName logSourceName;
            synchronized (LogSourceName.class) {
                if (f80944a == null) {
                    f80944a = new LogSourceName();
                }
                logSourceName = f80944a;
            }
            return logSourceName;
        }

        /* renamed from: g */
        public static String m134215g(long j) {
            return f80945b.get(Long.valueOf(j));
        }

        /* renamed from: h */
        public static boolean m134216h(long j) {
            return f80945b.containsKey(Long.valueOf(j));
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.LogSourceName";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_log_source";
        }

        /* renamed from: e */
        public String mo96306a() {
            return C33278a.f80911f;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$a */
    public static final class C33288a extends C33308b<Boolean> {

        /* renamed from: a */
        public static C33288a f80946a;

        /* renamed from: f */
        public static synchronized C33288a m134221f() {
            C33288a aVar;
            synchronized (C33288a.class) {
                if (f80946a == null) {
                    f80946a = new C33288a();
                }
                aVar = f80946a;
            }
            return aVar;
        }

        /* renamed from: c */
        public String mo96310c() {
            return "firebase_performance_collection_deactivated";
        }

        /* renamed from: e */
        public Boolean mo96306a() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$b */
    public static final class C33289b extends C33308b<Boolean> {

        /* renamed from: a */
        public static C33289b f80947a;

        /* renamed from: f */
        public static synchronized C33289b m134225f() {
            C33289b bVar;
            synchronized (C33289b.class) {
                if (f80947a == null) {
                    f80947a = new C33289b();
                }
                bVar = f80947a;
            }
            return bVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "isEnabled";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "firebase_performance_collection_enabled";
        }

        /* renamed from: e */
        public Boolean mo96306a() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$c */
    public static final class C33290c extends C33308b<Boolean> {

        /* renamed from: a */
        public static C33290c f80948a;

        /* renamed from: f */
        public static synchronized C33290c m134230f() {
            C33290c cVar;
            synchronized (C33290c.class) {
                if (f80948a == null) {
                    f80948a = new C33290c();
                }
                cVar = f80948a;
            }
            return cVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "experiment_app_start_ttid";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_experiment_app_start_ttid";
        }

        /* renamed from: e */
        public Boolean mo96306a() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$d */
    public static final class C33291d extends C33308b<Float> {

        /* renamed from: a */
        public static C33291d f80949a;

        /* renamed from: f */
        public static synchronized C33291d m134236f() {
            C33291d dVar;
            synchronized (C33291d.class) {
                if (f80949a == null) {
                    f80949a = new C33291d();
                }
                dVar = f80949a;
            }
            return dVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "fragment_sampling_percentage";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_vc_fragment_sampling_rate";
        }

        /* renamed from: e */
        public Float mo96306a() {
            return Float.valueOf(0.0f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$e */
    public static final class C33292e extends C33308b<Long> {

        /* renamed from: a */
        public static C33292e f80950a;

        /* renamed from: f */
        public static synchronized C33292e m134242f() {
            C33292e eVar;
            synchronized (C33292e.class) {
                if (f80950a == null) {
                    f80950a = new C33292e();
                }
                eVar = f80950a;
            }
            return eVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_rl_network_event_count_bg";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 70L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$f */
    public static final class C33293f extends C33308b<Long> {

        /* renamed from: a */
        public static C33293f f80951a;

        /* renamed from: f */
        public static synchronized C33293f m134247f() {
            C33293f fVar;
            synchronized (C33293f.class) {
                if (f80951a == null) {
                    f80951a = new C33293f();
                }
                fVar = f80951a;
            }
            return fVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_rl_network_event_count_fg";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 700L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$g */
    public static final class C33294g extends C33308b<Float> {

        /* renamed from: a */
        public static C33294g f80952a;

        /* renamed from: f */
        public static synchronized C33294g m134252f() {
            C33294g gVar;
            synchronized (C33294g.class) {
                if (f80952a == null) {
                    f80952a = new C33294g();
                }
                gVar = f80952a;
            }
            return gVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_vc_network_request_sampling_rate";
        }

        /* renamed from: e */
        public Float mo96306a() {
            return Float.valueOf(1.0f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$h */
    public static final class C33295h extends C33308b<Long> {

        /* renamed from: a */
        public static C33295h f80953a;

        /* renamed from: f */
        public static synchronized C33295h m134257f() {
            C33295h hVar;
            synchronized (C33295h.class) {
                if (f80953a == null) {
                    f80953a = new C33295h();
                }
                hVar = f80953a;
            }
            return hVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_rl_time_limit_sec";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 600L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$i */
    public static final class C33296i extends C33308b<String> {

        /* renamed from: a */
        public static C33296i f80954a;

        /* renamed from: f */
        public static synchronized C33296i m134262f() {
            C33296i iVar;
            synchronized (C33296i.class) {
                if (f80954a == null) {
                    f80954a = new C33296i();
                }
                iVar = f80954a;
            }
            return iVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_disabled_android_versions";
        }

        /* renamed from: e */
        public String mo96306a() {
            return "";
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$j */
    public static final class C33297j extends C33308b<Boolean> {

        /* renamed from: a */
        public static C33297j f80955a;

        /* renamed from: f */
        public static synchronized C33297j m134267f() {
            C33297j jVar;
            synchronized (C33297j.class) {
                if (f80955a == null) {
                    f80955a = new C33297j();
                }
                jVar = f80955a;
            }
            return jVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_enabled";
        }

        /* renamed from: e */
        public Boolean mo96306a() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$k */
    public static final class C33298k extends C33308b<Long> {

        /* renamed from: a */
        public static C33298k f80956a;

        /* renamed from: f */
        public static synchronized C33298k m134272f() {
            C33298k kVar;
            synchronized (C33298k.class) {
                if (f80956a == null) {
                    f80956a = new C33298k();
                }
                kVar = f80956a;
            }
            return kVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 0L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$l */
    public static final class C33299l extends C33308b<Long> {

        /* renamed from: a */
        public static C33299l f80957a;

        /* renamed from: f */
        public static synchronized C33299l m134278f() {
            C33299l lVar;
            synchronized (C33299l.class) {
                if (f80957a == null) {
                    f80957a = new C33299l();
                }
                lVar = f80957a;
            }
            return lVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 100L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$m */
    public static final class C33300m extends C33308b<Long> {

        /* renamed from: a */
        public static C33300m f80958a;

        /* renamed from: f */
        public static synchronized C33300m m134284f() {
            C33300m mVar;
            synchronized (C33300m.class) {
                if (f80958a == null) {
                    f80958a = new C33300m();
                }
                mVar = f80958a;
            }
            return mVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_max_length_minutes";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_session_max_duration_min";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 240L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$n */
    public static final class C33301n extends C33308b<Long> {

        /* renamed from: a */
        public static C33301n f80959a;

        /* renamed from: f */
        public static synchronized C33301n m134290f() {
            C33301n nVar;
            synchronized (C33301n.class) {
                if (f80959a == null) {
                    f80959a = new C33301n();
                }
                nVar = f80959a;
            }
            return nVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 0L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$o */
    public static final class C33302o extends C33308b<Long> {

        /* renamed from: a */
        public static C33302o f80960a;

        /* renamed from: f */
        public static synchronized C33302o m134296f() {
            C33302o oVar;
            synchronized (C33302o.class) {
                if (f80960a == null) {
                    f80960a = new C33302o();
                }
                oVar = f80960a;
            }
            return oVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 100L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$p */
    public static final class C33303p extends C33308b<Float> {

        /* renamed from: a */
        public static C33303p f80961a;

        /* renamed from: f */
        public static synchronized C33303p m134302f() {
            C33303p pVar;
            synchronized (C33303p.class) {
                if (f80961a == null) {
                    f80961a = new C33303p();
                }
                pVar = f80961a;
            }
            return pVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        /* renamed from: c */
        public String mo96310c() {
            return "sessions_sampling_percentage";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_vc_session_sampling_rate";
        }

        /* renamed from: e */
        public Float mo96306a() {
            return Float.valueOf(0.01f);
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$q */
    public static final class C33304q extends C33308b<Long> {

        /* renamed from: a */
        public static C33304q f80962a;

        /* renamed from: f */
        public static synchronized C33304q m134308f() {
            C33304q qVar;
            synchronized (C33304q.class) {
                if (f80962a == null) {
                    f80962a = new C33304q();
                }
                qVar = f80962a;
            }
            return qVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_rl_trace_event_count_bg";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 30L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$r */
    public static final class C33305r extends C33308b<Long> {

        /* renamed from: a */
        public static C33305r f80963a;

        /* renamed from: f */
        public static synchronized C33305r m134313f() {
            C33305r rVar;
            synchronized (C33305r.class) {
                if (f80963a == null) {
                    f80963a = new C33305r();
                }
                rVar = f80963a;
            }
            return rVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_rl_trace_event_count_fg";
        }

        /* renamed from: e */
        public Long mo96306a() {
            return 300L;
        }
    }

    /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$s */
    public static final class C33306s extends C33308b<Float> {

        /* renamed from: a */
        public static C33306s f80964a;

        /* renamed from: f */
        public static synchronized C33306s m134318f() {
            C33306s sVar;
            synchronized (C33306s.class) {
                if (f80964a == null) {
                    f80964a = new C33306s();
                }
                sVar = f80964a;
            }
            return sVar;
        }

        /* renamed from: b */
        public String mo96307b() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        /* renamed from: d */
        public String mo96308d() {
            return "fpr_vc_trace_sampling_rate";
        }

        /* renamed from: e */
        public Float mo96306a() {
            return Float.valueOf(1.0f);
        }
    }
}
