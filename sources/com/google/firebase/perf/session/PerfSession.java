package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.p049v1.PerfSession;
import com.google.firebase.perf.p049v1.SessionVerbosity;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C33397a();

    /* renamed from: a */
    public final String f81167a;

    /* renamed from: b */
    public final Timer f81168b;

    /* renamed from: c */
    public boolean f81169c;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    public class C33397a implements Parcelable.Creator<PerfSession> {
        /* renamed from: a */
        public PerfSession createFromParcel(@C0359n0 Parcel parcel) {
            return new PerfSession(parcel, (C33397a) null);
        }

        /* renamed from: b */
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public /* synthetic */ PerfSession(Parcel parcel, C33397a aVar) {
        this(parcel);
    }

    @C0363p0
    /* renamed from: b */
    public static com.google.firebase.perf.p049v1.PerfSession[] m134676b(@C0359n0 List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.p049v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.p049v1.PerfSession[list.size()];
        com.google.firebase.perf.p049v1.PerfSession a = list.get(0).mo96776a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.p049v1.PerfSession a2 = list.get(i).mo96776a();
            if (z || !list.get(i).mo96781g()) {
                perfSessionArr[i] = a2;
            } else {
                perfSessionArr[0] = a2;
                perfSessionArr[i] = a;
                z = true;
            }
        }
        if (!z) {
            perfSessionArr[0] = a;
        }
        return perfSessionArr;
    }

    /* renamed from: c */
    public static PerfSession m134677c() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new C33431a());
        perfSession.mo96783j(m134679k());
        return perfSession;
    }

    @C0344h1
    /* renamed from: h */
    public static boolean m134678h(@C0359n0 com.google.firebase.perf.p049v1.PerfSession perfSession) {
        for (SessionVerbosity sessionVerbosity : perfSession.getSessionVerbosityList()) {
            if (sessionVerbosity == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m134679k() {
        C33307a h = C33307a.m134328h();
        if (!h.mo96352M() || Math.random() >= ((double) h.mo96345F())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public com.google.firebase.perf.p049v1.PerfSession mo96776a() {
        PerfSession.C33476c U = com.google.firebase.perf.p049v1.PerfSession.newBuilder().mo97180U(this.f81167a);
        if (this.f81169c) {
            U.mo97177R(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (com.google.firebase.perf.p049v1.PerfSession) U.mo100473g();
    }

    /* renamed from: d */
    public Timer mo96777d() {
        return this.f81168b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo96779e() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f81168b.mo96891c()) > C33307a.m134328h().mo96342C()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo96780f() {
        return this.f81169c;
    }

    /* renamed from: g */
    public boolean mo96781g() {
        return this.f81169c;
    }

    /* renamed from: i */
    public String mo96782i() {
        return this.f81167a;
    }

    /* renamed from: j */
    public void mo96783j(boolean z) {
        this.f81169c = z;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeString(this.f81167a);
        parcel.writeByte(this.f81169c ? (byte) 1 : 0);
        parcel.writeParcelable(this.f81168b, 0);
    }

    @C0344h1(otherwise = 3)
    public PerfSession(String str, C33431a aVar) {
        this.f81169c = false;
        this.f81167a = str;
        this.f81168b = aVar.mo96901a();
    }

    public PerfSession(@C0359n0 Parcel parcel) {
        boolean z = false;
        this.f81169c = false;
        this.f81167a = parcel.readString();
        this.f81169c = parcel.readByte() != 0 ? true : z;
        this.f81168b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
