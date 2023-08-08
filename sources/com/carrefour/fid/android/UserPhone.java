package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UserPhone extends GeneratedMessageLite<UserPhone, C13139b> implements C13843b1 {
    /* access modifiers changed from: private */
    public static final UserPhone DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile C34504y1<UserPhone> PARSER = null;
    public static final int PREFERENCE_FIELD_NUMBER = 2;
    private String number_ = "";
    private boolean preference_;

    /* renamed from: com.carrefour.fid.android.UserPhone$a */
    public static /* synthetic */ class C13138a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32258a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32258a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.UserPhone.C13138a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.UserPhone$b */
    public static final class C13139b extends GeneratedMessageLite.C34263b<UserPhone, C13139b> implements C13843b1 {
        /* renamed from: P */
        public C13139b mo31113P() {
            mo100457F();
            ((UserPhone) this.f83053b).clearNumber();
            return this;
        }

        /* renamed from: R */
        public C13139b mo31114R() {
            mo100457F();
            ((UserPhone) this.f83053b).clearPreference();
            return this;
        }

        /* renamed from: S */
        public C13139b mo31115S(String str) {
            mo100457F();
            ((UserPhone) this.f83053b).setNumber(str);
            return this;
        }

        /* renamed from: T */
        public C13139b mo31116T(ByteString byteString) {
            mo100457F();
            ((UserPhone) this.f83053b).setNumberBytes(byteString);
            return this;
        }

        /* renamed from: U */
        public C13139b mo31117U(boolean z) {
            mo100457F();
            ((UserPhone) this.f83053b).setPreference(z);
            return this;
        }

        public String getNumber() {
            return ((UserPhone) this.f83053b).getNumber();
        }

        public ByteString getNumberBytes() {
            return ((UserPhone) this.f83053b).getNumberBytes();
        }

        public boolean getPreference() {
            return ((UserPhone) this.f83053b).getPreference();
        }

        public C13139b() {
            super(UserPhone.DEFAULT_INSTANCE);
        }
    }

    static {
        UserPhone userPhone = new UserPhone();
        DEFAULT_INSTANCE = userPhone;
        GeneratedMessageLite.registerDefaultInstance(UserPhone.class, userPhone);
    }

    private UserPhone() {
    }

    /* access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = getDefaultInstance().getNumber();
    }

    /* access modifiers changed from: private */
    public void clearPreference() {
        this.preference_ = false;
    }

    public static UserPhone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13139b newBuilder() {
        return (C13139b) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserPhone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPhone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<UserPhone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setNumber(String str) {
        str.getClass();
        this.number_ = str;
    }

    /* access modifiers changed from: private */
    public void setNumberBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.number_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPreference(boolean z) {
        this.preference_ = z;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13138a.f32258a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserPhone();
            case 2:
                return new C13139b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"number_", "preference_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<UserPhone> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (UserPhone.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getNumber() {
        return this.number_;
    }

    public ByteString getNumberBytes() {
        return ByteString.m137260e0(this.number_);
    }

    public boolean getPreference() {
        return this.preference_;
    }

    public static C13139b newBuilder(UserPhone userPhone) {
        return (C13139b) DEFAULT_INSTANCE.createBuilder(userPhone);
    }

    public static UserPhone parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserPhone parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static UserPhone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserPhone parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static UserPhone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserPhone parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static UserPhone parseFrom(InputStream inputStream) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPhone parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserPhone parseFrom(C34448s sVar) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UserPhone parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (UserPhone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
