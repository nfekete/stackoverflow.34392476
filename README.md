# About

This is an example repository for testing the question asked here:

<http://stackoverflow.com/questions/34392476/cant-unmarshal-marshalled-document-when-default-namespace-used>

## Problem

The classes in **.export* are generated classes. I don't have influence on the namespace.
The namespace is generated. In this testcase I named it *urn:stackoverflow:randomnamespace*.

The class *Document* is not generated from a schema. I have full control over this class.

The xml to parse / unmarshal sets a different namespace for *Export* and it is unprefixed.

See the failing tests for more insight.

## JAXB Implementations

I favor the exclipselink jaxb implementation, but will test the default jdk implementation as well to be sure, 
it behaves the same. Thus I got different packages for the model. 



