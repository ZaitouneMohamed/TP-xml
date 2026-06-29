<?xml version="1.0"?>
 
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 
<xsl:template match="/">
 
<html>
<body>
<h2>Températures des villes</h2>
 
<table border="1">
<tr>
<th>Date</th>
<th>Ville</th>
<th>Température</th>
</tr>
 
<xsl:for-each select="meteo/mesure">
  <xsl:for-each select="ville">
    <tr>
      <td><xsl:value-of select="../@date"/></td>
      <td><xsl:value-of select="@nom"/></td>
      <td><xsl:value-of select="@temperature"/></td>
    </tr>
  </xsl:for-each>
</xsl:for-each>
 
</table>
 
</body>
</html>
 
</xsl:template>
</xsl:stylesheet>
 