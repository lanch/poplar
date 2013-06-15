package org.apache.jsp.WEB_002dINF.views.pics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tags/form/list.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/table.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/pagination.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/column.tagx");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_page_005flist_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_page_005flist_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  page:list
    org.apache.jsp.tag.web.form.list_tagx _jspx_th_page_005flist_005f0 = new org.apache.jsp.tag.web.form.list_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_page_005flist_005f0);
    _jspx_th_page_005flist_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/pics/list.jspx(5,102) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setZ("1hx+rbiGaVQ6XsRiV3aHkMiFY7s=");
    // /WEB-INF/views/pics/list.jspx(5,102) name = items type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pics}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/pics/list.jspx(5,102) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setId("pl_cn_edu_pku_poplar_domain_Pic");
    _jspx_th_page_005flist_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_page_005flist_005f0, null));
    _jspx_th_page_005flist_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_page_005flist_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005ftable_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:table
    org.apache.jsp.tag.web.form.fields.table_tagx _jspx_th_table_005ftable_005f0 = new org.apache.jsp.tag.web.form.fields.table_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005ftable_005f0);
    _jspx_th_table_005ftable_005f0.setJspContext(_jspx_page_context);
    _jspx_th_table_005ftable_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(6,119) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setZ("AR2bosveoYwx9Jo58uwywD/Ae2o=");
    // /WEB-INF/views/pics/list.jspx(6,119) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setPath("/pics");
    // /WEB-INF/views/pics/list.jspx(6,119) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setId("l_cn_edu_pku_poplar_domain_Pic");
    // /WEB-INF/views/pics/list.jspx(6,119) name = data type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setData((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pics}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_table_005ftable_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_table_005ftable_005f0, null));
    _jspx_th_table_005ftable_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005ftable_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f0 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f0);
    _jspx_th_table_005fcolumn_005f0.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(7,128) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setZ("uVQuB8FjeTc39FcraOOYTwNXyGQ=");
    // /WEB-INF/views/pics/list.jspx(7,128) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setProperty("referName");
    // /WEB-INF/views/pics/list.jspx(7,128) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setId("c_cn_edu_pku_poplar_domain_Pic_referName");
    _jspx_th_table_005fcolumn_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f1 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f1);
    _jspx_th_table_005fcolumn_005f1.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(8,136) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setZ("E7ZUMjqFsrvQiArllgA36r+EYeU=");
    // /WEB-INF/views/pics/list.jspx(8,136) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setProperty("forwardPrimer");
    // /WEB-INF/views/pics/list.jspx(8,136) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setId("c_cn_edu_pku_poplar_domain_Pic_forwardPrimer");
    _jspx_th_table_005fcolumn_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f2 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f2);
    _jspx_th_table_005fcolumn_005f2.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(9,136) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setZ("upVI247nZFzSuPUC11AyxNs7fmU=");
    // /WEB-INF/views/pics/list.jspx(9,136) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setProperty("reversePrimer");
    // /WEB-INF/views/pics/list.jspx(9,136) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setId("c_cn_edu_pku_poplar_domain_Pic_reversePrimer");
    _jspx_th_table_005fcolumn_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f3 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f3);
    _jspx_th_table_005fcolumn_005f3.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(10,128) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setZ("WtMK7GYrzkPXi/3j49RqSQU8kMM=");
    // /WEB-INF/views/pics/list.jspx(10,128) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setProperty("picRepeat");
    // /WEB-INF/views/pics/list.jspx(10,128) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setId("c_cn_edu_pku_poplar_domain_Pic_picRepeat");
    _jspx_th_table_005fcolumn_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f3);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f4 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f4);
    _jspx_th_table_005fcolumn_005f4.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f4.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(11,132) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f4.setZ("nd2GLFSQyDiYc3u4m1Pj6pHPfCE=");
    // /WEB-INF/views/pics/list.jspx(11,132) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f4.setProperty("templateNum");
    // /WEB-INF/views/pics/list.jspx(11,132) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f4.setId("c_cn_edu_pku_poplar_domain_Pic_templateNum");
    _jspx_th_table_005fcolumn_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f4);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f5 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f5);
    _jspx_th_table_005fcolumn_005f5.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/pics/list.jspx(12,116) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f5.setZ("2oAmXR+UpLZKFE5p/m6vQjscFDM=");
    // /WEB-INF/views/pics/list.jspx(12,116) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f5.setProperty("pic");
    // /WEB-INF/views/pics/list.jspx(12,116) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f5.setId("c_cn_edu_pku_poplar_domain_Pic_pic");
    _jspx_th_table_005fcolumn_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f5);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_005ftable_005f0(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_005fcolumn_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f3(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f5(_jspx_parent, _jspx_page_context))
        return true;
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
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
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
