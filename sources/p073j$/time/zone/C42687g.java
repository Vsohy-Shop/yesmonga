package p073j$.time.zone;

import com.urbanairship.analytics.location.C35560b;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j$.time.zone.g */
public abstract class C42687g {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f108000a;

    /* renamed from: b */
    private static final ConcurrentMap f108001b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f108000a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C42685e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected C42687g() {
    }

    /* renamed from: a */
    public static Set m172580a() {
        return new HashSet(((ConcurrentHashMap) f108001b).keySet());
    }

    /* renamed from: b */
    public static C42683c m172581b(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f108001b;
        C42687g gVar = (C42687g) concurrentHashMap.get(str);
        if (gVar != null) {
            return gVar.mo138259c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C42684d("No time-zone data files registered");
        }
        throw new C42684d("Unknown time-zone ID: ".concat(str));
    }

    /* renamed from: e */
    public static void m172582e(C42687g gVar) {
        Objects.requireNonNull(gVar, C35560b.f87807Z0);
        for (String str : gVar.mo138260d()) {
            Objects.requireNonNull(str, "zoneId");
            if (((C42687g) ((ConcurrentHashMap) f108001b).putIfAbsent(str, gVar)) != null) {
                throw new C42684d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
            }
        }
        f108000a.add(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C42683c mo138259c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Set mo138260d();
}
