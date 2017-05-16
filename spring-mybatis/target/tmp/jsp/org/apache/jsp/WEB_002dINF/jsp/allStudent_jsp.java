package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class allStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--如果为escapeXml=\"false\"，则将其中的html和xml解析出来。-->\r\n");
      if (_jspx_meth_json_object_0(_jspx_page_context))
        return;
      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_json_object_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:object
    atg.taglib.json.JsonObjectTag _jspx_th_json_object_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonObjectTag.class) : new atg.taglib.json.JsonObjectTag();
    _jspx_th_json_object_0.setJspContext(_jspx_page_context);
    _jspx_th_json_object_0.setEscapeXml(false);
    _jspx_th_json_object_0.setJspBody(new allStudent_jspHelper( 0, _jspx_page_context, _jspx_th_json_object_0, null));
    _jspx_th_json_object_0.doTag();
    return false;
  }

  private boolean _jspx_meth_json_array_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:array
    atg.taglib.json.JsonArrayTag _jspx_th_json_array_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonArrayTag.class) : new atg.taglib.json.JsonArrayTag();
    _jspx_th_json_array_0.setJspContext(_jspx_page_context);
    _jspx_th_json_array_0.setParent(_jspx_parent);
    _jspx_th_json_array_0.setName("studentlist");
    _jspx_th_json_array_0.setJspBody(new allStudent_jspHelper( 1, _jspx_page_context, _jspx_th_json_array_0, null));
    _jspx_th_json_array_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("student");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("\t\t  ");
          if (_jspx_meth_json_object_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(' ');
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_json_object_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:object
    atg.taglib.json.JsonObjectTag _jspx_th_json_object_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonObjectTag.class) : new atg.taglib.json.JsonObjectTag();
    _jspx_th_json_object_1.setJspContext(_jspx_page_context);
    _jspx_th_json_object_1.setParent(_jspx_th_c_forEach_0);
    _jspx_th_json_object_1.setJspBody(new allStudent_jspHelper( 2, _jspx_page_context, _jspx_th_json_object_1, _jspx_push_body_count_c_forEach_0));
    _jspx_th_json_object_1.doTag();
    return false;
  }

  private boolean _jspx_meth_json_property_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context, int[] _jspx_push_body_count)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:property
    atg.taglib.json.JsonPropertyTag _jspx_th_json_property_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonPropertyTag.class) : new atg.taglib.json.JsonPropertyTag();
    _jspx_th_json_property_0.setJspContext(_jspx_page_context);
    _jspx_th_json_property_0.setParent(_jspx_parent);
    _jspx_th_json_property_0.setName("name");
    _jspx_th_json_property_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_json_property_0.doTag();
    return false;
  }

  private boolean _jspx_meth_json_property_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context, int[] _jspx_push_body_count)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:property
    atg.taglib.json.JsonPropertyTag _jspx_th_json_property_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonPropertyTag.class) : new atg.taglib.json.JsonPropertyTag();
    _jspx_th_json_property_1.setJspContext(_jspx_page_context);
    _jspx_th_json_property_1.setParent(_jspx_parent);
    _jspx_th_json_property_1.setName("qq");
    _jspx_th_json_property_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.qq}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_json_property_1.doTag();
    return false;
  }

  private boolean _jspx_meth_json_property_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context, int[] _jspx_push_body_count)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:property
    atg.taglib.json.JsonPropertyTag _jspx_th_json_property_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonPropertyTag.class) : new atg.taglib.json.JsonPropertyTag();
    _jspx_th_json_property_2.setJspContext(_jspx_page_context);
    _jspx_th_json_property_2.setParent(_jspx_parent);
    _jspx_th_json_property_2.setName("id");
    _jspx_th_json_property_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_json_property_2.doTag();
    return false;
  }

  private class allStudent_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public allStudent_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("<!--列表的名字是studentlist，items后面跟的是要遍历的表，var后面跟的是要遍历的元素 -->\r\n");
      out.write("\t");
      if (_jspx_meth_json_array_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("<!--object下对应的是每一个对象，property是属性 -->\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_json_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context, _jspx_push_body_count))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_json_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context, _jspx_push_body_count))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_json_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context, _jspx_push_body_count))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
