package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.i */
public final class C21997i {
    static String[] AFInAppEventType;
    static final int AFKeystoreWrapper = ((int) TimeUnit.SECONDS.toMillis(2));
    static String[] AFLogger$LogLevel;
    @VisibleForTesting
    private static C21997i AppsFlyer2dXConversionCallback;
    @VisibleForTesting
    public static Intent valueOf;
    static volatile boolean values;
    public DeepLinkListener AFInAppEventParameterName;
    public Map<String, String> AFVersionDeclaration;
    public String getLevel;
    @Nullable
    public List<List<String>> init = new ArrayList();

    public static C21997i AFKeystoreWrapper() {
        if (AppsFlyer2dXConversionCallback == null) {
            AppsFlyer2dXConversionCallback = new C21997i();
        }
        return AppsFlyer2dXConversionCallback;
    }

    /* access modifiers changed from: private */
    public static boolean valueOf(String str) {
        if (AFInAppEventType == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(AFInAppEventType));
        AFLogger.AFInAppEventType(sb.toString());
        try {
            return Arrays.asList(AFInAppEventType).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Nullable
    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(final Context context, final Map<String, Object> map, final Uri uri) {
        if (valueOf(uri.toString())) {
            values = true;
            if (C22004m.AFInAppEventType == null) {
                C22004m.AFInAppEventType = new C22004m();
            }
            C22004m mVar = C22004m.AFInAppEventType;
            if (mVar.AFKeystoreWrapper == null) {
                mVar.AFKeystoreWrapper = Executors.newSingleThreadScheduledExecutor(mVar.valueOf);
            }
            mVar.AFKeystoreWrapper.execute(new Runnable() {
                private static Map<String, Object> values(Uri uri) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri.toString());
                        AFLogger.values(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i = C21997i.AFKeystoreWrapper;
                        httpURLConnection.setReadTimeout(i);
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.5.2");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.values("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                    }
                    return hashMap;
                }

                public final void run() {
                    String str;
                    int i;
                    Uri uri;
                    String str2;
                    Integer num;
                    String str3;
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num2 = null;
                    String str4 = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 5) {
                            break;
                        }
                        Map<String, Object> values = values(Uri.parse(obj));
                        str2 = (String) values.get("res");
                        num = (Integer) values.get("status");
                        str3 = (String) values.get("error");
                        if (str2 == null || !C21997i.valueOf(str2)) {
                            Integer num3 = num;
                            str4 = str3;
                            obj = str2;
                            num2 = num3;
                        } else {
                            if (i2 < 4) {
                                arrayList.add(str2);
                            }
                            i2++;
                            Integer num4 = num;
                            str4 = str3;
                            obj = str2;
                            num2 = num4;
                        }
                    }
                    Integer num32 = num;
                    str4 = str3;
                    obj = str2;
                    num2 = num32;
                    HashMap hashMap = new HashMap();
                    if (obj != null) {
                        str = obj;
                    } else {
                        str = "";
                    }
                    hashMap.put("res", str);
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    hashMap.put("status", Integer.valueOf(i));
                    if (str4 != null) {
                        hashMap.put("error", str4);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put("af_deeplink_r", hashMap);
                        map.put("af_deeplink", uri.toString());
                    }
                    C21868ah valueOf2 = C21868ah.valueOf();
                    Context context = context;
                    Map map = map;
                    if (obj != null) {
                        uri = Uri.parse(obj);
                    } else {
                        uri = uri;
                    }
                    valueOf2.valueOf(context, (Map<String, Object>) map, uri);
                    C21997i.values = false;
                }
            });
        } else {
            C21868ah.valueOf().valueOf(context, map, uri);
        }
        valueOf = null;
    }

    public final void AFKeystoreWrapper(Map<String, Object> map, C21952cf cfVar, Intent intent, C21930bo boVar, Context context) {
        DeepLinkResult.Error error;
        SharedPreferences valueOf2 = C21868ah.valueOf(context);
        if (!AFInAppEventParameterName(intent, context, map) && this.AFInAppEventParameterName != null && C21868ah.valueOf().valueOf(valueOf2, false) == 0 && !valueOf2.getBoolean("ddl_sent", false)) {
            C21891ao aoVar = new C21891ao(context, cfVar);
            AFLogger.values("[DDL] start");
            FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() {
                public final /* synthetic */ java.lang.Object call(
/*
Method generation error in method: com.appsflyer.internal.ao.4.call():java.lang.Object, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.ao.4.call():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            new Thread(futureTask).start();
            try {
                DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(C21891ao.onAttributionFailureNative, TimeUnit.MILLISECONDS);
                aoVar.onInstallConversionFailureNative.values(deepLinkResult, C21891ao.onAttributionFailureNative);
                C21897aq.valueOf(deepLinkResult);
            } catch (InterruptedException | ExecutionException e) {
                AFLogger.valueOf("[DDL] Error occurred", e);
                if (e.getCause() instanceof IOException) {
                    error = DeepLinkResult.Error.NETWORK;
                } else {
                    error = DeepLinkResult.Error.UNEXPECTED;
                }
                DeepLinkResult deepLinkResult2 = new DeepLinkResult((DeepLink) null, error);
                aoVar.onInstallConversionFailureNative.values(deepLinkResult2, C21891ao.onAttributionFailureNative);
                C21897aq.valueOf(deepLinkResult2);
            } catch (TimeoutException unused) {
                StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
                sb.append(aoVar.onResponseErrorNative);
                sb.append(" attempt(s) within ");
                sb.append(C21891ao.onAttributionFailureNative);
                sb.append(" milliseconds");
                AFLogger.values(sb.toString());
                DeepLinkResult deepLinkResult3 = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.TIMEOUT);
                aoVar.onInstallConversionFailureNative.values(deepLinkResult3, C21891ao.onAttributionFailureNative);
                C21897aq.valueOf(deepLinkResult3);
            }
        }
        boVar.values("ddl_sent", true);
    }

    @Nullable
    @VisibleForTesting
    public static Uri values(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x006e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean AFInAppEventParameterName(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            r1 = 0
            if (r9 == 0) goto L_0x0014
            java.lang.String r2 = r9.getAction()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0014
            android.net.Uri r2 = r9.getData()
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            android.content.Intent r3 = valueOf
            if (r3 == 0) goto L_0x0028
            java.lang.String r4 = r3.getAction()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0028
            android.net.Uri r0 = r3.getData()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            android.os.Bundle r3 = r9.getExtras()
            java.util.List<java.util.List<java.lang.String>> r4 = r8.init
            if (r4 == 0) goto L_0x008f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x008f
            if (r3 != 0) goto L_0x003a
            goto L_0x008f
        L_0x003a:
            java.util.List<java.util.List<java.lang.String>> r4 = r8.init
            java.util.Iterator r4 = r4.iterator()
        L_0x0040:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0050
        L_0x004e:
            r6 = r1
            goto L_0x006c
        L_0x0050:
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x005b
            goto L_0x004e
        L_0x005b:
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r3.getString(r7)
            if (r7 != 0) goto L_0x0068
            goto L_0x004e
        L_0x0068:
            android.net.Uri r6 = r8.values(r7, r6)
        L_0x006c:
            if (r6 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Found deeplink in push payload at "
            r1.<init>(r3)
            java.lang.String r3 = r5.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.values(r1)
            java.util.Map r1 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r11)
            java.lang.String r3 = "payloadKey"
            java.util.List<java.util.List<java.lang.String>> r4 = r8.init
            r1.put(r3, r4)
            r1 = r6
        L_0x008f:
            r3 = 1
            java.lang.String r4 = " w/af_consumed"
            r5 = 0
            java.lang.String r6 = "af_consumed"
            if (r2 == 0) goto L_0x00c1
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r0)
            r8.AFInAppEventParameterName((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r2)
            return r3
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r2.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9)
            return r5
        L_0x00c1:
            if (r0 == 0) goto L_0x00f1
            android.content.Intent r9 = valueOf
            boolean r9 = r9.hasExtra(r6)
            if (r9 != 0) goto L_0x00d8
            android.content.Intent r9 = valueOf
            long r1 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r1)
            r8.AFInAppEventParameterName((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r0)
            return r3
        L_0x00d8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed trampoline deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r0.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9)
            return r5
        L_0x00f1:
            if (r1 == 0) goto L_0x011d
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x0104
            long r4 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r4)
            r8.AFInAppEventParameterName((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Object>) r11, (android.net.Uri) r1)
            return r3
        L_0x0104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link from push: "
            r9.<init>(r10)
            java.lang.String r10 = r1.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9)
            return r5
        L_0x011d:
            java.lang.String r9 = "No deep link detected"
            com.appsflyer.AFLogger.values(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21997i.AFInAppEventParameterName(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }
}
