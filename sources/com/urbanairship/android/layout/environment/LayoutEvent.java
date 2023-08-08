package com.urbanairship.android.layout.environment;

import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class LayoutEvent {

    /* renamed from: com.urbanairship.android.layout.environment.LayoutEvent$a */
    public static final class C35585a extends LayoutEvent {
        @C12579k

        /* renamed from: a */
        public static final C35585a f87985a = new C35585a();

        public C35585a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.urbanairship.android.layout.environment.LayoutEvent$b */
    public static final class C35586b extends LayoutEvent {
        @C12579k

        /* renamed from: a */
        public final ReportingEvent f87986a;
        @C12579k

        /* renamed from: b */
        public final C35868d f87987b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35586b(@C12579k ReportingEvent reportingEvent, @C12579k C35868d dVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(reportingEvent, "event");
            Intrinsics.checkNotNullParameter(dVar, C9175a.f24932Y);
            this.f87986a = reportingEvent;
            this.f87987b = dVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C35586b m146870d(C35586b bVar, ReportingEvent reportingEvent, C35868d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                reportingEvent = bVar.f87986a;
            }
            if ((i & 2) != 0) {
                dVar = bVar.f87987b;
            }
            return bVar.mo106621c(reportingEvent, dVar);
        }

        @C12579k
        /* renamed from: a */
        public final ReportingEvent mo106619a() {
            return this.f87986a;
        }

        @C12579k
        /* renamed from: b */
        public final C35868d mo106620b() {
            return this.f87987b;
        }

        @C12579k
        /* renamed from: c */
        public final C35586b mo106621c(@C12579k ReportingEvent reportingEvent, @C12579k C35868d dVar) {
            Intrinsics.checkNotNullParameter(reportingEvent, "event");
            Intrinsics.checkNotNullParameter(dVar, C9175a.f24932Y);
            return new C35586b(reportingEvent, dVar);
        }

        @C12579k
        /* renamed from: e */
        public final C35868d mo106622e() {
            return this.f87987b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35586b)) {
                return false;
            }
            C35586b bVar = (C35586b) obj;
            return Intrinsics.areEqual((Object) this.f87986a, (Object) bVar.f87986a) && Intrinsics.areEqual((Object) this.f87987b, (Object) bVar.f87987b);
        }

        @C12579k
        /* renamed from: f */
        public final ReportingEvent mo106624f() {
            return this.f87986a;
        }

        public int hashCode() {
            return (this.f87986a.hashCode() * 31) + this.f87987b.hashCode();
        }

        @C12579k
        public String toString() {
            return "Report(event=" + this.f87986a + ", context=" + this.f87987b + ')';
        }
    }

    public /* synthetic */ LayoutEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class SubmitForm extends LayoutEvent {
        @C12579k

        /* renamed from: a */
        public final String f87983a;
        @C12579k

        /* renamed from: b */
        public final C11300l<C11045c<? super C11079d2>, Object> f87984b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SubmitForm(String str, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new C11300l<C11045c<? super C11079d2>, Object>((C11045c<? super C355841>) null) {
                int label;

                @C12579k
                public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
                    return 

                    public LayoutEvent() {
                    }
                }
