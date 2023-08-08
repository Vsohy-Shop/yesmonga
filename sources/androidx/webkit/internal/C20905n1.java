package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: androidx.webkit.internal.n1 */
public class C20905n1 {

    /* renamed from: a */
    public final WebSettingsBoundaryInterface f53947a;

    public C20905n1(@C0359n0 WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f53947a = webSettingsBoundaryInterface;
    }

    /* renamed from: a */
    public int mo62651a() {
        return this.f53947a.getDisabledActionModeMenuItems();
    }

    /* renamed from: b */
    public boolean mo62652b() {
        return this.f53947a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    /* renamed from: c */
    public int mo62653c() {
        return this.f53947a.getForceDark();
    }

    /* renamed from: d */
    public int mo62654d() {
        return this.f53947a.getForceDarkBehavior();
    }

    /* renamed from: e */
    public boolean mo62655e() {
        return this.f53947a.getOffscreenPreRaster();
    }

    @C0359n0
    /* renamed from: f */
    public Set<String> mo62656f() {
        return this.f53947a.getRequestedWithHeaderOriginAllowList();
    }

    /* renamed from: g */
    public boolean mo62657g() {
        return this.f53947a.getSafeBrowsingEnabled();
    }

    /* renamed from: h */
    public boolean mo62658h() {
        return this.f53947a.isAlgorithmicDarkeningAllowed();
    }

    /* renamed from: i */
    public void mo62659i(boolean z) {
        this.f53947a.setAlgorithmicDarkeningAllowed(z);
    }

    /* renamed from: j */
    public void mo62660j(int i) {
        this.f53947a.setDisabledActionModeMenuItems(i);
    }

    /* renamed from: k */
    public void mo62661k(boolean z) {
        this.f53947a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    /* renamed from: l */
    public void mo62662l(int i) {
        this.f53947a.setForceDark(i);
    }

    /* renamed from: m */
    public void mo62663m(int i) {
        this.f53947a.setForceDarkBehavior(i);
    }

    /* renamed from: n */
    public void mo62664n(boolean z) {
        this.f53947a.setOffscreenPreRaster(z);
    }

    /* renamed from: o */
    public void mo62665o(@C0359n0 Set<String> set) {
        this.f53947a.setRequestedWithHeaderOriginAllowList(set);
    }

    /* renamed from: p */
    public void mo62666p(boolean z) {
        this.f53947a.setSafeBrowsingEnabled(z);
    }

    /* renamed from: q */
    public void mo62667q(boolean z) {
        this.f53947a.setWillSuppressErrorPage(z);
    }

    /* renamed from: r */
    public boolean mo62668r() {
        return this.f53947a.getWillSuppressErrorPage();
    }
}
