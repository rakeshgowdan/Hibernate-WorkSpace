instead of accessing Db every time , access Cache 

if query has already executed and in same session if he request same query 
then access the cache .

Types:
First level cache [same session ],[by default given]
Second level cache [Diffrent session][want to configure(ehcache,os,swarm)]


Configuration
EHcahe::
Configure :: POM.xml
			download Jar
			downlaod h.hamcrest-ehcahe
			
In hibernate.cfg.xml
enable SLC
Permission For EHcache

By default all entity is not cacheable
@cachable(implies its caching)
@cache (strategy

