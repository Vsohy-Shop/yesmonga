package com.google.rpc;

import com.google.protobuf.C34471v0;

public enum Code implements C34471v0.C34474c {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: H0 */
    public static final int f83585H0 = 0;

    /* renamed from: I0 */
    public static final int f83586I0 = 1;

    /* renamed from: J0 */
    public static final int f83587J0 = 2;

    /* renamed from: K0 */
    public static final int f83588K0 = 3;

    /* renamed from: L0 */
    public static final int f83589L0 = 4;

    /* renamed from: M0 */
    public static final int f83590M0 = 5;

    /* renamed from: N0 */
    public static final int f83591N0 = 6;

    /* renamed from: O0 */
    public static final int f83592O0 = 7;

    /* renamed from: P0 */
    public static final int f83593P0 = 16;

    /* renamed from: Q0 */
    public static final int f83594Q0 = 8;

    /* renamed from: R0 */
    public static final int f83595R0 = 9;

    /* renamed from: S0 */
    public static final int f83596S0 = 10;

    /* renamed from: T0 */
    public static final int f83597T0 = 11;

    /* renamed from: U0 */
    public static final int f83598U0 = 12;

    /* renamed from: V0 */
    public static final int f83599V0 = 13;

    /* renamed from: W0 */
    public static final int f83600W0 = 14;

    /* renamed from: X0 */
    public static final int f83602X0 = 15;

    /* renamed from: Y0 */
    public static final C34471v0.C34475d<Code> f83604Y0 = null;
    private final int value;

    /* renamed from: com.google.rpc.Code$a */
    public class C34516a implements C34471v0.C34475d<Code> {
        /* renamed from: b */
        public Code mo93187a(int i) {
            return Code.m140815b(i);
        }
    }

    /* renamed from: com.google.rpc.Code$b */
    public static final class C34517b implements C34471v0.C34476e {

        /* renamed from: a */
        public static final C34471v0.C34476e f83619a = null;

        static {
            f83619a = new C34517b();
        }

        /* renamed from: a */
        public boolean mo93189a(int i) {
            return Code.m140815b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f83604Y0 = new C34516a();
    }

    /* access modifiers changed from: public */
    Code(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static Code m140815b(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    /* renamed from: g */
    public static C34471v0.C34475d<Code> m140816g() {
        return f83604Y0;
    }

    /* renamed from: q */
    public static C34471v0.C34476e m140817q() {
        return C34517b.f83619a;
    }

    @Deprecated
    /* renamed from: r */
    public static Code m140818r(int i) {
        return m140815b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
