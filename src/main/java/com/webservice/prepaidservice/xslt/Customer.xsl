<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/Customer">
  <Customer>
   <Name><xsl:value-of select="name"/></Name>
   <Id><xsl:value-of select="id"/></Id>
   <Description><xsl:value-of select="description"/></Description>
</Customer>
</xsl:template>
</xsl:stylesheet>