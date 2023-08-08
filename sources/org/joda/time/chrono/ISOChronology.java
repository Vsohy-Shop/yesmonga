package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12589a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C12651d;
import org.joda.time.field.C12656i;

public final class ISOChronology extends AssembledChronology {

    /* renamed from: Z0 */
    public static final ISOChronology f31007Z0;

    /* renamed from: a1 */
    public static final ConcurrentHashMap<DateTimeZone, ISOChronology> f31008a1;
    private static final long serialVersionUID = -6212696554273812441L;

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* renamed from: a */
        public transient DateTimeZone f31009a;

        public Stub(DateTimeZone dateTimeZone) {
            this.f31009a = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f31009a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.m52934b0(this.f31009a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f31009a);
        }
    }

    static {
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = new ConcurrentHashMap<>();
        f31008a1 = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.m52917Z0());
        f31007Z0 = iSOChronology;
        concurrentHashMap.put(DateTimeZone.f30651a, iSOChronology);
    }

    public ISOChronology(C12589a aVar) {
        super(aVar, (Object) null);
    }

    /* renamed from: a0 */
    public static ISOChronology m52933a0() {
        return m52934b0(DateTimeZone.m51374n());
    }

    /* renamed from: b0 */
    public static ISOChronology m52934b0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = f31008a1;
        ISOChronology iSOChronology = concurrentHashMap.get(dateTimeZone);
        if (iSOChronology != null) {
            return iSOChronology;
        }
        ISOChronology iSOChronology2 = new ISOChronology(ZonedChronology.m53047c0(f31007Z0, dateTimeZone));
        ISOChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, iSOChronology2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return iSOChronology2;
    }

    /* renamed from: c0 */
    public static ISOChronology m52935c0() {
        return f31007Z0;
    }

    private Object writeReplace() {
        return new Stub(mo27836s());
    }

    /* renamed from: Q */
    public C12589a mo27834Q() {
        return f31007Z0;
    }

    /* renamed from: R */
    public C12589a mo27835R(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        if (dateTimeZone == mo27836s()) {
            return this;
        }
        return m52934b0(dateTimeZone);
    }

    /* renamed from: W */
    public void mo28849W(AssembledChronology.C12600a aVar) {
        if (mo28850X().mo27836s() == DateTimeZone.f30651a) {
            C12651d dVar = new C12651d(C12620n.f31099e, DateTimeFieldType.m51348x(), 100);
            aVar.f30911H = dVar;
            aVar.f30923k = dVar.mo28841t();
            aVar.f30910G = new C12656i((C12651d) aVar.f30911H, DateTimeFieldType.m51323X());
            aVar.f30906C = new C12656i((C12651d) aVar.f30911H, aVar.f30920h, DateTimeFieldType.m51321V());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return mo27836s().equals(((ISOChronology) obj).mo27836s());
        }
        return false;
    }

    public int hashCode() {
        return 800855 + mo27836s().hashCode();
    }

    public String toString() {
        DateTimeZone s = mo27836s();
        if (s == null) {
            return "ISOChronology";
        }
        return "ISOChronology" + C12361b.f30260k + s.mo27824q() + C12361b.f30261l;
    }
}
