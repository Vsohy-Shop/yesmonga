package com.urbanairship.android.layout.event;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.json.JsonValue;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ReportingEvent {
    @C0359n0

    /* renamed from: a */
    public final ReportType f88050a;

    public enum ReportType {
        PAGE_VIEW,
        PAGE_SWIPE,
        BUTTON_TAP,
        OUTSIDE_DISMISS,
        BUTTON_DISMISS,
        FORM_RESULT,
        FORM_DISPLAY
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$a */
    public static class C35615a extends ReportingEvent {
        @C0359n0

        /* renamed from: b */
        public final String f88059b;

        public C35615a(@C0359n0 String str) {
            super(ReportType.BUTTON_TAP);
            this.f88059b = str;
        }

        @C0359n0
        /* renamed from: a */
        public String mo106751a() {
            return this.f88059b;
        }

        @C0359n0
        public String toString() {
            return "ReportingEvent.ButtonTap{buttonId='" + this.f88059b + '\'' + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$b */
    public static class C35616b extends C35618d {
        @C0359n0

        /* renamed from: c */
        public final String f88060c;
        @C0363p0

        /* renamed from: d */
        public final String f88061d;

        /* renamed from: e */
        public final boolean f88062e;

        public C35616b(@C0359n0 String str, @C0363p0 String str2, boolean z, long j) {
            super(ReportType.BUTTON_DISMISS, j);
            this.f88060c = str;
            this.f88061d = str2;
            this.f88062e = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ long mo106753a() {
            return super.mo106753a();
        }

        @C0363p0
        /* renamed from: b */
        public String mo106754b() {
            return this.f88061d;
        }

        @C0359n0
        /* renamed from: c */
        public String mo106755c() {
            return this.f88060c;
        }

        /* renamed from: d */
        public boolean mo106756d() {
            return this.f88062e;
        }

        @C0359n0
        public String toString() {
            return "ReportingEvent.DismissFromButton{buttonId='" + this.f88060c + '\'' + ", buttonDescription='" + this.f88061d + '\'' + ", cancel=" + this.f88062e + ", displayTime=" + mo106753a() + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$c */
    public static class C35617c extends C35618d {
        public C35617c(long j) {
            super(ReportType.OUTSIDE_DISMISS, j);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ long mo106753a() {
            return super.mo106753a();
        }

        @C0359n0
        public String toString() {
            return "ReportingEvent.DismissFromOutside{displayTime=" + mo106753a() + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$d */
    public static abstract class C35618d extends ReportingEvent {

        /* renamed from: b */
        public final long f88063b;

        public C35618d(@C0359n0 ReportType reportType, long j) {
            super(reportType);
            this.f88063b = j;
        }

        /* renamed from: a */
        public long mo106753a() {
            return this.f88063b;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$e */
    public static class C35619e extends ReportingEvent {
        @C0359n0

        /* renamed from: b */
        public final C35867c f88064b;

        public C35619e(@C0359n0 C35867c cVar) {
            super(ReportType.FORM_DISPLAY);
            this.f88064b = cVar;
        }

        @C0359n0
        /* renamed from: a */
        public C35867c mo106759a() {
            return this.f88064b;
        }

        @C0359n0
        public String toString() {
            return "ReportingEvent.FormDisplay{formInfo='" + this.f88064b + '\'' + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$f */
    public static class C35620f extends ReportingEvent {
        @C0359n0

        /* renamed from: b */
        public final FormData.C35856a f88065b;
        @C0359n0

        /* renamed from: c */
        public final C35867c f88066c;
        @C0359n0

        /* renamed from: d */
        public final Map<C35865a, JsonValue> f88067d;

        public C35620f(@C0359n0 FormData.C35856a aVar, @C0359n0 C35867c cVar, @C0359n0 Map<C35865a, JsonValue> map) {
            super(ReportType.FORM_RESULT);
            this.f88065b = aVar;
            this.f88066c = cVar;
            this.f88067d = map;
        }

        @C0359n0
        /* renamed from: a */
        public Map<C35865a, JsonValue> mo106761a() {
            return this.f88067d;
        }

        @C0359n0
        /* renamed from: b */
        public FormData.C35856a mo106762b() {
            return this.f88065b;
        }

        @C0359n0
        /* renamed from: c */
        public C35867c mo106763c() {
            return this.f88066c;
        }

        public String toString() {
            return "FormResult{formData=" + this.f88065b + ", formInfo=" + this.f88066c + ", attributes=" + this.f88067d + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$g */
    public static class C35621g extends C35623i {

        /* renamed from: c */
        public final int f88068c;

        /* renamed from: d */
        public final int f88069d;

        /* renamed from: e */
        public final String f88070e;

        /* renamed from: f */
        public final String f88071f;

        public C35621g(@C0359n0 C35869e eVar, int i, @C0359n0 String str, int i2, @C0359n0 String str2) {
            super(ReportType.PAGE_SWIPE, eVar);
            this.f88068c = i;
            this.f88070e = str;
            this.f88069d = i2;
            this.f88071f = str2;
        }

        @C0359n0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C35869e mo106765a() {
            return super.mo106765a();
        }

        @C0359n0
        /* renamed from: b */
        public String mo106766b() {
            return this.f88070e;
        }

        /* renamed from: c */
        public int mo106767c() {
            return this.f88068c;
        }

        @C0359n0
        /* renamed from: d */
        public String mo106768d() {
            return this.f88071f;
        }

        /* renamed from: e */
        public int mo106769e() {
            return this.f88069d;
        }

        public String toString() {
            return "PageSwipe{fromPageIndex=" + this.f88068c + ", toPageIndex=" + this.f88069d + ", fromPageId='" + this.f88070e + '\'' + ", toPageId='" + this.f88071f + '\'' + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$h */
    public static class C35622h extends C35623i {

        /* renamed from: c */
        public final long f88072c;

        public C35622h(@C0359n0 C35869e eVar, long j) {
            super(ReportType.PAGE_VIEW, eVar);
            this.f88072c = j;
        }

        @C0359n0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C35869e mo106765a() {
            return super.mo106765a();
        }

        /* renamed from: b */
        public long mo106771b() {
            return this.f88072c;
        }

        @C0359n0
        public String toString() {
            return "ReportingEvent.PageView{pagerData=" + mo106765a() + ", displayedAt=" + mo106771b() + C12361b.f30259j;
        }
    }

    /* renamed from: com.urbanairship.android.layout.event.ReportingEvent$i */
    public static abstract class C35623i extends ReportingEvent {
        @C0359n0

        /* renamed from: b */
        public final C35869e f88073b;

        public C35623i(@C0359n0 ReportType reportType, @C0359n0 C35869e eVar) {
            super(reportType);
            this.f88073b = eVar;
        }

        @C0359n0
        /* renamed from: a */
        public C35869e mo106765a() {
            return this.f88073b;
        }
    }

    public ReportingEvent(@C0359n0 ReportType reportType) {
        this.f88050a = reportType;
    }
}
