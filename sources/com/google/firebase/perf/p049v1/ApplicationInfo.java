package com.google.firebase.perf.p049v1;

import com.google.firebase.perf.p049v1.AndroidApplicationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.firebase.perf.v1.ApplicationInfo */
public final class ApplicationInfo extends GeneratedMessageLite<ApplicationInfo, C33449b> implements C33489c {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile C34504y1<ApplicationInfo> PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.m138446i();
    private String googleAppId_ = "";

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$a */
    public static /* synthetic */ class C33448a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81347a;

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
                f81347a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81347a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.ApplicationInfo.C33448a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$b */
    public static final class C33449b extends GeneratedMessageLite.C34263b<ApplicationInfo, C33449b> implements C33489c {
        public /* synthetic */ C33449b(C33448a aVar) {
            this();
        }

        /* renamed from: P */
        public C33449b mo96959P() {
            mo100457F();
            ((ApplicationInfo) this.f83053b).clearAndroidAppInfo();
            return this;
        }

        /* renamed from: R */
        public C33449b mo96960R() {
            mo100457F();
            ((ApplicationInfo) this.f83053b).clearAppInstanceId();
            return this;
        }

        /* renamed from: S */
        public C33449b mo96961S() {
            mo100457F();
            ((ApplicationInfo) this.f83053b).clearApplicationProcessState();
            return this;
        }

        /* renamed from: T */
        public C33449b mo96962T() {
            mo100457F();
            ((ApplicationInfo) this.f83053b).getMutableCustomAttributesMap().clear();
            return this;
        }

        /* renamed from: U */
        public C33449b mo96963U() {
            mo100457F();
            ((ApplicationInfo) this.f83053b).clearGoogleAppId();
            return this;
        }

        /* renamed from: V */
        public C33449b mo96964V(AndroidApplicationInfo androidApplicationInfo) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).mergeAndroidAppInfo(androidApplicationInfo);
            return this;
        }

        /* renamed from: Y */
        public C33449b mo96965Y(Map<String, String> map) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        /* renamed from: Z */
        public C33449b mo96966Z(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo100457F();
            ((ApplicationInfo) this.f83053b).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        /* renamed from: a0 */
        public C33449b mo96967a0(String str) {
            str.getClass();
            mo100457F();
            ((ApplicationInfo) this.f83053b).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        /* renamed from: b0 */
        public C33449b mo96968b0(AndroidApplicationInfo.C33445b bVar) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setAndroidAppInfo((AndroidApplicationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: c0 */
        public C33449b mo96969c0(AndroidApplicationInfo androidApplicationInfo) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setAndroidAppInfo(androidApplicationInfo);
            return this;
        }

        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((ApplicationInfo) this.f83053b).getCustomAttributesMap().containsKey(str);
        }

        /* renamed from: d0 */
        public C33449b mo96970d0(String str) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setAppInstanceId(str);
            return this;
        }

        /* renamed from: g0 */
        public C33449b mo96971g0(ByteString byteString) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setAppInstanceIdBytes(byteString);
            return this;
        }

        public AndroidApplicationInfo getAndroidAppInfo() {
            return ((ApplicationInfo) this.f83053b).getAndroidAppInfo();
        }

        public String getAppInstanceId() {
            return ((ApplicationInfo) this.f83053b).getAppInstanceId();
        }

        public ByteString getAppInstanceIdBytes() {
            return ((ApplicationInfo) this.f83053b).getAppInstanceIdBytes();
        }

        public ApplicationProcessState getApplicationProcessState() {
            return ((ApplicationInfo) this.f83053b).getApplicationProcessState();
        }

        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        public int getCustomAttributesCount() {
            return ((ApplicationInfo) this.f83053b).getCustomAttributesMap().size();
        }

        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((ApplicationInfo) this.f83053b).getCustomAttributesMap());
        }

        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((ApplicationInfo) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            return str2;
        }

        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((ApplicationInfo) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getGoogleAppId() {
            return ((ApplicationInfo) this.f83053b).getGoogleAppId();
        }

        public ByteString getGoogleAppIdBytes() {
            return ((ApplicationInfo) this.f83053b).getGoogleAppIdBytes();
        }

        /* renamed from: h0 */
        public C33449b mo96972h0(ApplicationProcessState applicationProcessState) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setApplicationProcessState(applicationProcessState);
            return this;
        }

        public boolean hasAndroidAppInfo() {
            return ((ApplicationInfo) this.f83053b).hasAndroidAppInfo();
        }

        public boolean hasAppInstanceId() {
            return ((ApplicationInfo) this.f83053b).hasAppInstanceId();
        }

        public boolean hasApplicationProcessState() {
            return ((ApplicationInfo) this.f83053b).hasApplicationProcessState();
        }

        public boolean hasGoogleAppId() {
            return ((ApplicationInfo) this.f83053b).hasGoogleAppId();
        }

        /* renamed from: i0 */
        public C33449b mo96973i0(String str) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setGoogleAppId(str);
            return this;
        }

        /* renamed from: j0 */
        public C33449b mo96974j0(ByteString byteString) {
            mo100457F();
            ((ApplicationInfo) this.f83053b).setGoogleAppIdBytes(byteString);
            return this;
        }

        public C33449b() {
            super(ApplicationInfo.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$c */
    public static final class C33450c {

        /* renamed from: a */
        public static final C34363f1<String, String> f81348a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f81348a = C34363f1.m139185f(fieldType, "", fieldType, "");
        }
    }

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        GeneratedMessageLite.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    private ApplicationInfo() {
    }

    /* access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    public static ApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.mo100543n()) {
            this.customAttributes_ = this.customAttributes_.mo100549t();
        }
        return this.customAttributes_;
    }

    /* access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 == null || androidApplicationInfo2 == AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = androidApplicationInfo;
        } else {
            this.androidAppInfo_ = (AndroidApplicationInfo) ((AndroidApplicationInfo.C33445b) AndroidApplicationInfo.newBuilder(this.androidAppInfo_).mo100463K(androidApplicationInfo)).mo100467Q();
        }
        this.bitField0_ |= 4;
    }

    public static C33449b newBuilder() {
        return (C33449b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ApplicationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    public void setAppInstanceIdBytes(ByteString byteString) {
        this.appInstanceId_ = byteString.mo99228S0();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setApplicationProcessState(ApplicationProcessState applicationProcessState) {
        this.applicationProcessState_ = applicationProcessState.getNumber();
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* access modifiers changed from: private */
    public void setGoogleAppIdBytes(ByteString byteString) {
        this.googleAppId_ = byteString.mo99228S0();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33448a.f81347a[methodToInvoke.ordinal()]) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new C33449b((C33448a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.m134872q(), "customAttributes_", C33450c.f81348a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ApplicationInfo> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ApplicationInfo.class) {
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

    public AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.getDefaultInstance() : androidApplicationInfo;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public ByteString getAppInstanceIdBytes() {
        return ByteString.m137260e0(this.appInstanceId_);
    }

    public ApplicationProcessState getApplicationProcessState() {
        ApplicationProcessState b = ApplicationProcessState.m134870b(this.applicationProcessState_);
        if (b == null) {
            return ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        return b;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        return str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    public ByteString getGoogleAppIdBytes() {
        return ByteString.m137260e0(this.googleAppId_);
    }

    public boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationProcessState() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33449b newBuilder(ApplicationInfo applicationInfo) {
        return (C33449b) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ApplicationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ApplicationInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ApplicationInfo parseFrom(C34448s sVar) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ApplicationInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
