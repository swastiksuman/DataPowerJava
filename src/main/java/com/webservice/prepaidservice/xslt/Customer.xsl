<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/Customer">
  <Customer>
   <Version><xsl:value-of select="version"/></Version>
   <Name><xsl:value-of select="name"/></Name>
   <Id><xsl:value-of select="id"/></Id>
   <Description><xsl:value-of select="description"/></Description>
   <Price><xsl:value-of select="price"/></Price>
   <xsl:if test="version > 1">
   <Address>
	<Main><xsl:value-of select="Address/main"/></Main>
	<State><xsl:value-of select="Address/state"/></State>
   </Address>
   </xsl:if>
</Customer>
</xsl:template>
</xsl:stylesheet>