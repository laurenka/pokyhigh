SUMMARY = "Smart OnOff System"
LICENSE = "CLOSED"

# Add missing RDEPENDS (should be implemented by npm class)
RDEPENDS_${PN} += "nodejs nodejs-npm"

SRC_URI = "http://dykim@192.168.0.88/smartonoff/production.git;protocol=http \
          npm://registry.npmjs.org;name=sqlite3;version=3.1.4;subdir=node_modules/sqlite3 \
          npm://registry.npmjs.org;name=sequelize;version=3.30.4;subdir=node_modules/sequelize \
          npm://registry.npmjs.org;name=feathers-primus;version=2.1.0;subdir=node_modules/feathers-primus \
          npm://registry.npmjs.org;name=feathers-configuration;version=0.4.1;subdir=node_modules/feathers-configuration \
          npm://registry.npmjs.org;name=ws;version=2.2.3;subdir=node_modules/ws \
          "

SRCREV = "7b44de07cdf2f08d94ee1f33a31699fc471004ca"
SRC_URI[md5sum] = "f3723dd6971d17b58df42cfd115b1718"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

S = "${WORKDIR}/smartonoff"
