package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.gson.k */
public abstract class C33699k {
    /* renamed from: A */
    public float mo97528A() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: H */
    public int mo97529H() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: M */
    public C33623h mo97768M() {
        if (mo97772i0()) {
            return (C33623h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: Q */
    public C33700l mo97769Q() {
        if (mo97773j0()) {
            return (C33700l) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    /* renamed from: W */
    public C33701m mo97770W() {
        if (mo97774k0()) {
            return (C33701m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: X */
    public C33703o mo97771X() {
        if (mo97775l0()) {
            return (C33703o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: Y */
    public long mo97530Y() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public abstract C33699k mo97531e();

    /* renamed from: e0 */
    public Number mo97532e0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f0 */
    public short mo97534f0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public BigDecimal mo97535h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h0 */
    public String mo97536h0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: i */
    public BigInteger mo97538i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: i0 */
    public boolean mo97772i0() {
        return this instanceof C33623h;
    }

    /* renamed from: j0 */
    public boolean mo97773j0() {
        return this instanceof C33700l;
    }

    /* renamed from: k */
    public boolean mo97540k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k0 */
    public boolean mo97774k0() {
        return this instanceof C33701m;
    }

    /* renamed from: l0 */
    public boolean mo97775l0() {
        return this instanceof C33703o;
    }

    /* renamed from: q */
    public Boolean mo97776q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: r */
    public byte mo97545r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C33713c cVar = new C33713c(stringWriter);
            cVar.setLenient(true);
            Streams.write(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: w */
    public char mo97552w() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: y */
    public double mo97554y() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
