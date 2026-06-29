<?xml version="1.0" encoding="UTF-8"?>
 
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 
<xsl:template match="/">
 
<html>
<body>
 
<h2>Releve Bancaire</h2>
 
<table border="1">
<tr>
<th>Type</th>
<th>Date</th>
<th>Montant</th>
<th>Description</th>
</tr>
 
<xsl:for-each select="releve/operations/operation">
<tr>
<td><xsl:value-of select="@type"/></td>
<td><xsl:value-of select="@date"/></td>
<td><xsl:value-of select="@montant"/></td>
<td><xsl:value-of select="@description"/></td>
</tr>
</xsl:for-each>
 
</table>
 
<h3>Total CREDIT :
<xsl:value-of select="sum(releve/operations/operation[@type='CREDIT']/@montant)"/>
</h3>
 
<h3>Total DEBIT :
<xsl:value-of select="sum(releve/operations/operation[@type='DEBIT']/@montant)"/>
</h3>
 
</body>
</html>
 
</xsl:template>
 
</xsl:stylesheet>