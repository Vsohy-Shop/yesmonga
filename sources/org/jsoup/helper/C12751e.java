package org.jsoup.helper;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.installations.C33124s;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12766a;
import org.jsoup.nodes.C12773d;
import org.jsoup.nodes.C12774e;
import org.jsoup.nodes.C12775f;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12783m;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.C12956d;
import org.jsoup.select.C12957e;
import org.jsoup.select.Selector;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

/* renamed from: org.jsoup.helper.e */
public class C12751e {

    /* renamed from: b */
    public static final String f31518b = "jsoupSource";

    /* renamed from: c */
    public static final String f31519c = "javax.xml.xpath.XPathFactory:jsoup";

    /* renamed from: a */
    public DocumentBuilderFactory f31520a;

    /* renamed from: org.jsoup.helper.e$a */
    public static class C12752a implements C12957e {

        /* renamed from: d */
        public static final String f31521d = "xmlns";

        /* renamed from: e */
        public static final String f31522e = "xmlns:";

        /* renamed from: a */
        public final Document f31523a;

        /* renamed from: b */
        public final Stack<HashMap<String, String>> f31524b;

        /* renamed from: c */
        public Node f31525c;

        public C12752a(Document document) {
            Stack<HashMap<String, String>> stack = new Stack<>();
            this.f31524b = stack;
            this.f31523a = document;
            stack.push(new HashMap());
            this.f31525c = document;
        }

        /* renamed from: a */
        public void mo29626a(C12779j jVar, int i) {
            if ((jVar instanceof Element) && (this.f31525c.getParentNode() instanceof org.w3c.dom.Element)) {
                this.f31525c = this.f31525c.getParentNode();
            }
            this.f31524b.pop();
        }

        /* renamed from: b */
        public void mo29627b(C12779j jVar, int i) {
            org.w3c.dom.Element element;
            this.f31524b.push(new HashMap(this.f31524b.peek()));
            if (jVar instanceof Element) {
                Element element2 = (Element) jVar;
                String str = (String) this.f31524b.peek().get(mo29630e(element2));
                String V2 = element2.mo29745V2();
                if (str == null) {
                    try {
                        if (V2.contains(C33124s.f80355c)) {
                            element = this.f31523a.createElementNS("", V2);
                            mo29629d(element2, element);
                            mo29628c(element, element2);
                            this.f31525c = element;
                        }
                    } catch (DOMException unused) {
                        Document document = this.f31523a;
                        mo29628c(document.createTextNode("<" + V2 + ">"), element2);
                        return;
                    }
                }
                element = this.f31523a.createElementNS(str, V2);
                mo29629d(element2, element);
                mo29628c(element, element2);
                this.f31525c = element;
            } else if (jVar instanceof C12783m) {
                C12783m mVar = (C12783m) jVar;
                mo29628c(this.f31523a.createTextNode(mVar.mo29947I0()), mVar);
            } else if (jVar instanceof C12773d) {
                C12773d dVar = (C12773d) jVar;
                mo29628c(this.f31523a.createComment(dVar.mo29891I0()), dVar);
            } else if (jVar instanceof C12774e) {
                C12774e eVar = (C12774e) jVar;
                mo29628c(this.f31523a.createTextNode(eVar.mo29899I0()), eVar);
            }
        }

        /* renamed from: c */
        public final void mo29628c(Node node, C12779j jVar) {
            node.setUserData(C12751e.f31518b, jVar, (UserDataHandler) null);
            this.f31525c.appendChild(node);
        }

        /* renamed from: d */
        public final void mo29629d(C12779j jVar, org.w3c.dom.Element element) {
            Iterator<C12766a> it = jVar.mo29784l().iterator();
            while (it.hasNext()) {
                C12766a next = it.next();
                String f = C12766a.m55347f(next.getKey(), Document.OutputSettings.Syntax.xml);
                if (f != null) {
                    element.setAttribute(f, next.getValue());
                }
            }
        }

        /* renamed from: e */
        public final String mo29630e(Element element) {
            String str;
            Iterator<C12766a> it = element.mo29784l().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                C12766a next = it.next();
                String e = next.getKey();
                if (!e.equals(f31521d)) {
                    if (e.startsWith(f31522e)) {
                        str = e.substring(6);
                    }
                }
                this.f31524b.peek().put(str, next.getValue());
            }
            int indexOf = element.mo29745V2().indexOf(58);
            if (indexOf > 0) {
                return element.mo29745V2().substring(0, indexOf);
            }
            return str;
        }
    }

    public C12751e() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.f31520a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    /* renamed from: a */
    public static HashMap<String, String> m55076a() {
        return m55080j("html");
    }

    /* renamed from: b */
    public static HashMap<String, String> m55077b() {
        return m55080j("xml");
    }

    /* renamed from: d */
    public static String m55078d(org.w3c.dom.Document document, @Nullable Map<String, String> map) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            if (map != null) {
                newTransformer.setOutputProperties(m55081k(map));
            }
            if (document.getDoctype() != null) {
                DocumentType doctype = document.getDoctype();
                if (!C12759f.m55107g(doctype.getPublicId())) {
                    newTransformer.setOutputProperty("doctype-public", doctype.getPublicId());
                }
                if (!C12759f.m55107g(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", doctype.getSystemId());
                } else if (doctype.getName().equalsIgnoreCase("html") && C12759f.m55107g(doctype.getPublicId()) && C12759f.m55107g(doctype.getSystemId())) {
                    newTransformer.setOutputProperty("doctype-system", "about:legacy-compat");
                }
            }
            newTransformer.transform(dOMSource, streamResult);
            return stringWriter.toString();
        } catch (TransformerException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: e */
    public static org.w3c.dom.Document m55079e(org.jsoup.nodes.Document document) {
        return new C12751e().mo29622h(document);
    }

    /* renamed from: j */
    public static HashMap<String, String> m55080j(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(FirebaseAnalytics.C32532b.f78973v, str);
        return hashMap;
    }

    /* renamed from: k */
    public static Properties m55081k(Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    /* renamed from: c */
    public String mo29619c(org.w3c.dom.Document document) {
        return m55078d(document, (Map<String, String>) null);
    }

    /* renamed from: f */
    public void mo29620f(org.jsoup.nodes.Document document, org.w3c.dom.Document document2) {
        mo29621g(document, document2);
    }

    /* renamed from: g */
    public void mo29621g(Element element, org.w3c.dom.Document document) {
        org.jsoup.nodes.Document a0 = element.mo29924a0();
        if (a0 != null && !C12759f.m55107g(a0.mo29667u3())) {
            document.setDocumentURI(a0.mo29667u3());
        }
        if (element instanceof org.jsoup.nodes.Document) {
            element = element.mo29746W0(0);
        }
        C12956d.m56227c(new C12752a(document), element);
    }

    /* renamed from: h */
    public org.w3c.dom.Document mo29622h(org.jsoup.nodes.Document document) {
        return mo29623i(document);
    }

    /* renamed from: i */
    public org.w3c.dom.Document mo29623i(Element element) {
        C12775f fVar;
        C12750d.m55073j(element);
        try {
            DocumentBuilder newDocumentBuilder = this.f31520a.newDocumentBuilder();
            DOMImplementation dOMImplementation = newDocumentBuilder.getDOMImplementation();
            org.w3c.dom.Document newDocument = newDocumentBuilder.newDocument();
            org.jsoup.nodes.Document a0 = element.mo29924a0();
            if (a0 != null) {
                fVar = a0.mo29663o3();
            } else {
                fVar = null;
            }
            if (fVar != null) {
                newDocument.appendChild(dOMImplementation.createDocumentType(fVar.mo29902H0(), fVar.mo29903I0(), fVar.mo29905L0()));
            }
            newDocument.setXmlStandalone(true);
            mo29621g(element, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    public NodeList mo29624l(String str, org.w3c.dom.Document document) {
        XPathFactory xPathFactory;
        C12750d.m55071h(str);
        C12750d.m55073j(document);
        try {
            if (System.getProperty(f31519c) != null) {
                xPathFactory = XPathFactory.newInstance("jsoup");
            } else {
                xPathFactory = XPathFactory.newInstance();
            }
            NodeList nodeList = (NodeList) xPathFactory.newXPath().compile(str).evaluate(document, XPathConstants.NODESET);
            C12750d.m55073j(nodeList);
            return nodeList;
        } catch (XPathExpressionException | XPathFactoryConfigurationException e) {
            throw new Selector.SelectorParseException("Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        }
    }

    /* renamed from: m */
    public <T extends C12779j> List<T> mo29625m(NodeList nodeList, Class<T> cls) {
        C12750d.m55073j(nodeList);
        C12750d.m55073j(cls);
        ArrayList arrayList = new ArrayList(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Object userData = nodeList.item(i).getUserData(f31518b);
            if (cls.isInstance(userData)) {
                arrayList.add((C12779j) cls.cast(userData));
            }
        }
        return arrayList;
    }
}
