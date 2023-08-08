package kotlin.p010io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.m */
public final class C11160m implements C11559m<String> {
    @C12579k

    /* renamed from: a */
    public final BufferedReader f28364a;

    /* renamed from: kotlin.io.m$a */
    public static final class C11161a implements Iterator<String>, C11345a {
        @C12580l

        /* renamed from: a */
        public String f28365a;

        /* renamed from: b */
        public boolean f28366b;

        /* renamed from: c */
        public final /* synthetic */ C11160m f28367c;

        public C11161a(C11160m mVar) {
            this.f28367c = mVar;
        }

        @C12579k
        /* renamed from: b */
        public String next() {
            if (hasNext()) {
                String str = this.f28365a;
                this.f28365a = null;
                Intrinsics.checkNotNull(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f28365a == null && !this.f28366b) {
                String readLine = this.f28367c.f28364a.readLine();
                this.f28365a = readLine;
                if (readLine == null) {
                    this.f28366b = true;
                }
            }
            if (this.f28365a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11160m(@C12579k BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "reader");
        this.f28364a = bufferedReader;
    }

    @C12579k
    public Iterator<String> iterator() {
        return new C11161a(this);
    }
}
